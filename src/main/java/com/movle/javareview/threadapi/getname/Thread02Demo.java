package com.movle.javareview.threadapi.getname;

/**
 * @ClassName Thread02Demo
 * @MethodDesc: 线程的基本方法
 *      run()
 *      start()
 * @Author Movle
 * @Date 11/8/20 3:37 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Thread02Demo {
    public static void main(String[] args) {
        MyThread02 mt = new MyThread02();
        mt.start();
        new MyThread02().start();
        new MyThread02().start();

        System.out.println("主"+Thread.currentThread().getName());
    }
}
