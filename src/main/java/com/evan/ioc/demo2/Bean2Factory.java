package com.evan.ioc.demo2;

/*
Bean2的静态工厂
 */
public class Bean2Factory {

    public static Bean2 createBean2(){
        System.out.println("Bean2Factory 方法已经执行了...");
        return new Bean2();
    }
}
