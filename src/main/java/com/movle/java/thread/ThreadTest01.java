package com.movle.java.thread;

/**
 * @ClassName ThreadTest01
 * @MethodDesc: TODO 多线程创建的三种方式之继承Thread接口
 * @Author Movle
 * @Date 1/9/20 4:42 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


/**
 * 1.自定义一个类，继承java.lang包下的Thread类
 * 2.重写run方法
 * 3.将要在线程中执行的代码编写在run方法中
 * 4.创建上面自定义类的对象
 * 5.调用start方法启动线程
 */

//1.自定义一个类，继承java.lang包下的Thread类
class MyThread extends Thread{
    //2.重写run方法
    @Override
    public void run() {

        //3.将要在线程中执行的代码编写在run方法中
        for (int i = 0; i <1000 ; i++) {
            System.out.println("1024");
        }

    }
}


public class ThreadTest01 extends Thread{

    public static void main(String[] args) {

        //4.创建上面自定义类的对象
        //创建一个线程
        MyThread mt = new MyThread();

        //5.调用start方法启动线程
        mt.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("hello");
        }
    }

}


