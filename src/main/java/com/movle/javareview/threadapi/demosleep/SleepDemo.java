package com.movle.javareview.threadapi.demosleep;

/**
 * @ClassName SleepDemo
 * @MethodDesc: 线程sleep方法
 * @Author Movle
 * @Date 11/8/20 4:17 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SleepDemo {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}