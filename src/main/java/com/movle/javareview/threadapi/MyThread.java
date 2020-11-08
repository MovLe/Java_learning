package com.movle.javareview.threadapi;

/**
 * @ClassName MyThread
 * @MethodDesc: Thread类的子类
 * @Author Movle
 * @Date 11/8/20 3:16 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("run:"+i);
        }
    }
}
