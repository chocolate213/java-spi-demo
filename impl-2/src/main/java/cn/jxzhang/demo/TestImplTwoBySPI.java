package cn.jxzhang.demo;

/**
 * TestImplTwoBySPI
 *
 * @author zhangjiaxing
 */
public class TestImplTwoBySPI implements TestInterfaceBySPI {

    static {
        System.out.println("impl two loaded");
    }


    public TestImplTwoBySPI() {
        System.out.println("impl two init");
    }

    @Override
    public void doSomething() {
        System.out.println("hello in impl-2");
    }
}
