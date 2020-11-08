package com.movle.javareview.threadapi.getname;

/**
 * @ClassName MyThread02
 * @MethodDesc: Thread类的常用方法
 *      currentThread()
 *      getName()
 * @Author Movle
 * @Date 11/8/20 3:36 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class MyThread02 extends Thread {
    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);

        Thread thread = Thread.currentThread();
        System.out.println(thread);

        String name = thread.getName();
        System.out.println(name);

        System.out.println("链式编程："+Thread.currentThread().getName());

    }
}
