package com.movle.javareview.threadapi.setname;

/**
 * @ClassName MyTread
 * @MethodDesc: 设置线程的名称
 * @Author Movle
 * @Date 11/8/20 4:07 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class My03Thread extends Thread{
    public My03Thread() {
    }

    public My03Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
