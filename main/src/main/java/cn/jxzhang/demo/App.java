package cn.jxzhang.demo;

import java.util.ServiceLoader;

/**
 * SPI：用反射实现加载接口实现类
 *
 * 1. 懒加载：在调用 next() 方法的时候才会加载该类
 *
 * 2. 被加载的类必须要有一个空参构造函数
 *
 * SLF4J 中绑定日志实现类采用的是ClassLoader的一个特性：一个类的全限定名只会加载一次
 *
 */
public class App {

    public static void main(String[] args) {
        testSPI();
        testClassLoader();
    }

    private static void testClassLoader() {
        TestInterfaceByClassLoader t = new TestImplByClassLoader();
        t.doSomething();
    }

    private static void testSPI() {
        ServiceLoader<TestInterfaceBySPI> load = ServiceLoader.load(TestInterfaceBySPI.class);

        for (TestInterfaceBySPI testInterface : load) {
            testInterface.doSomething();
        }
    }
}
