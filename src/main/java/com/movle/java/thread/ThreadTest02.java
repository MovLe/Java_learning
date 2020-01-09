package com.movle.java.thread;

/**
 * @ClassName ThreadTest02
 * @MethodDesc: TODO 多线程创建的三种方式之实现Runnable接口
 * @Author Movle
 * @Date 1/9/20 5:00 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/*
* 1.自定义一个类实现java.lang包下的Runnable接口
* 2.重写run方法
* 3.将要在线程中执行的代码编写在run方法中
* 4.创建上面自定义类的对象
* 5.创建Thread对象并将上面自定义类的对象作为参数传递给Thread的构造方法
* 6.调用start方法启动线程
* */

// 1.自定义一个类实现java.lang包下的Runnable接口
class MyRunnable implements Runnable {

    // 2.重写run方法
    @Override
    public void run() {

        // 3.将要在线程中执行的代码编写在run方法中
        for (int i = 0; i <2000 ; i++) {
            System.out.println("2048");
        }
    }
}


public class ThreadTest02 {

    public static void main(String[] args) {
        // 4.创建上面自定义类的对象
        MyRunnable mr = new MyRunnable();

        // 5.创建Thread对象并将上面自定义类的对象作为参数传递给Thread的构造方法
        Thread mt=new Thread(mr);

        //6.调用start方法启动线程
        mt.start();

        for (int i = 0; i <2000 ; i++) {
            System.out.println("babybabybabybabybabybabybabybabybabybaby");
        }


    }
}
