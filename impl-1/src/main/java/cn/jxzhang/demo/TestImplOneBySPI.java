package cn.jxzhang.demo;

/**
 * TestImplOneBySPI
 *
 * @author zhangjiaxing
 */
public class TestImplOneBySPI implements TestInterfaceBySPI {

    static {
        System.out.println("impl one loaded");
    }

    public TestImplOneBySPI() {
        System.out.println("impl one init");
    }

    @Override
    public void doSomething() {
        System.out.println("hello in impl-1");
    }
}
