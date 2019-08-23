package cn.jxzhang.demo;

/**
 * TestImplOneByClassLoader
 *
 * @author zhangjiaxing
 */
public class TestImplByClassLoader implements TestInterfaceByClassLoader{

    public TestImplByClassLoader() {
        System.out.println("TestImplByClassLoader init");
    }

    @Override
    public void doSomething() {
        System.out.println("hello in two class loader");
    }
}
