package com.movle.javareview.lambdaapi.demo01;

/**
 * @ClassName RunnableImpl
 * @MethodDesc: Runnable的实现类
 * @Author Movle
 * @Date 11/9/20 7:48 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"方式1新的线程创建了");
    }
}
