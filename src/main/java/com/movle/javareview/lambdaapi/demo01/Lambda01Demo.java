package com.movle.javareview.lambdaapi.demo01;

/**
 * @ClassName Lambda01Demo
 * @MethodDesc: 使用lambda表达式简化代码
 * @Author Movle
 * @Date 11/9/20 7:49 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Lambda01Demo {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类
        Thread thread = new Thread(run);
        //调用start方法开启新线程,执行run方法
        thread.start();

        //简化代码，使用匿名内部类，实现多线程程序
        Runnable r =new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"方式2新线程创建了");
            }
        };
        new Thread(r).start();


        //简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"方式3新线程创建了");
            }
        }).start();
    }
}
