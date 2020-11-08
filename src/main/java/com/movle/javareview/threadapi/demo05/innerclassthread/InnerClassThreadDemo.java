package com.movle.javareview.threadapi.demo05.innerclassthread;

/**
 * @ClassName InnerClassThreadDemo
 * @MethodDesc: 匿名内部类实现线程的创建
 * @Author Movle
 * @Date 11/8/20 4:55 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class InnerClassThreadDemo {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /**
     * 简化接口的方式
     */
    private static void demo03() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->kai");
                }
            }
        }).start();
    }

    /**
     * 线程的接口Runnable实现
     */
    private static void demo02() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->xiu");
                }
            }
        };
        Thread t2 = new Thread(r);
        t2.start();
    }

    /**
     * 线程的父类是Thread类
     */
    private static void demo01() {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"movle");
                }
            }
        }.start();
    }
}
