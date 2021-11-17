package com.movle.java.thread;

/**
 * @ClassName ThreadTest04
 * @MethodDesc: 匿名内部类创建线程，以及Lambda表达式创建线程
 * @Author Movle
 * @Date 1/9/20 5:39 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ThreadTest04 {


    public static void main(String[] args) {

        /*
         * 使用匿名内部类创建线程
         */
        new Thread(new Runnable() {   // 1.将Runnable的子类对象传递给Thread的构造方法
            @Override
            public void run() {       // 2.重写run方法
                for (int i = 0; i < 1000; i++) {        // 3.将要执行的代码写在run方法中
                    System.out.println("1024");
                }
            }
        }).start();




        //lambda写法
        //因为Thread类中接收Runnable类型的对象，所以编译器会识别出lambda表达式是Runnable对象
        new Thread(()->{
            for (int i = 0; i < 2000; i++) {
                System.out.println("Movle");
            }
        }).start();



    }
}
