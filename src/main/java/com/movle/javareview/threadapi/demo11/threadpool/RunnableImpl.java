package com.movle.javareview.threadapi.demo11.threadpool;

/**
 * @ClassName RunnableImpl
 * @MethodDesc: 实现Runnable接口实现线程
 * @Author Movle
 * @Date 11/9/20 7:29 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
