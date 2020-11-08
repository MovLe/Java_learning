package com.movle.javareview.threadapi;

/**
 * @ClassName Thread01Demo
 * @MethodDesc: 创建多线程的第一种方式创建Thread类的子类
 * @Author Movle
 * @Date 11/8/20 3:15 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Thread01Demo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 10000 ; i++) {
            System.out.println("main:"+i);
        }
    }
}
