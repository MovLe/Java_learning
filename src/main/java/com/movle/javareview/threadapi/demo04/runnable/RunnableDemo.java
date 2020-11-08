package com.movle.javareview.threadapi.demo04.runnable;

/**
 * @ClassName RunnableDemp
 * @MethodDesc: 创建线程的第二种方式，实现Runnable接口
 * @Author Movle
 * @Date 11/8/20 4:30 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RunnableDemo {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();

        Thread t = new Thread(run);

        t.start();

        for (int i = 0; i < 1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
