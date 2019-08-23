package cn.jxzhang.demo;

/**
 * TestImplByClassLoader
 *
 * @author zhangjiaxing
 */
public class TestImplByClassLoader implements TestInterfaceByClassLoader {

    public TestImplByClassLoader() {
        System.out.println("TestImplByClassLoader init");
    }

    @Override
    public void doSomething() {
        System.out.println("hello in one class loader");
    }
}
