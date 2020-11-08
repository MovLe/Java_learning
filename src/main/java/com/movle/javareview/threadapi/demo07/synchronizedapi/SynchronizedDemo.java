package com.movle.javareview.threadapi.demo07.synchronizedapi;

/**
 * @ClassName SynchronizedDemo
 * @MethodDesc: 测试线程同步方式一，利用同步代码块实现同步
 * @Author Movle
 * @Date 11/8/20 10:14 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SynchronizedDemo {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t1= new Thread(run);
        Thread t2= new Thread(run);
        Thread t3= new Thread(run);

        //调用start方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }
}
