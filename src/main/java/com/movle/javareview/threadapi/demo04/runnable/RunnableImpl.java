package com.movle.javareview.threadapi.demo04.runnable;

/**
 * @ClassName RunnableImpl
 * @MethodDesc: 实现Runnable接口
 * @Author Movle
 * @Date 11/8/20 4:29 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
