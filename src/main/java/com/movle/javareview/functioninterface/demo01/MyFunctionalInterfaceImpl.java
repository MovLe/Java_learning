package com.movle.javareview.functioninterface.demo01;

/**
 * @ClassName MyFunctionalInterfaceImpl
 * @MethodDesc: 抽象方法的实现类
 * @Author Movle
 * @Date 11/9/20 11:27 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void method() {
        System.out.println("接口实现类的方法！！！");
    }
}
