package com.movle.java.thread;

/**
 * @ClassName ThreadObject
 * @MethodDesc: TODO 获取线程对象
 * @Author Movle
 * @Date 1/9/20 5:53 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


//在使用Runnable接口来创建线程的时候，run方法中无法使用Thread类中的getName()方法，这时可以使用Thread.currentThread()方法获取Thread的对象，通过对象调用getName()方法。

public class ThreadObject {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println("方式一此线程的名字是："+getName()+"hello");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("方式二此线程的名字是："+Thread.currentThread().getName()+"world");
            }
        }).start();



        Thread.currentThread().setName("我是主线程");

        System.out.println(Thread.currentThread().getName());

    }

}
