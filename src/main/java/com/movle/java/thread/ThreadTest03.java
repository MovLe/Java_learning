package com.movle.java.thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @ClassName ThreadTest03
 * @MethodDesc: TODO 多线程创建的三种方式之实现Callable接口
 * @Author Movle
 * @Date 1/9/20 5:18 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/*
* 1.自定义一个类实现java.util.concurrent包下的Callable接口
* 2.重写call方法
* 3.将要在线程中执行的代码编写在call方法中
* 4.创建ExecutorService线程池
* 5.将自定义类的对象放入线程池里面
* 6.获取线程的返回结果
* 7.关闭线程池，不再接收新的线程，未执行完的线程不会被关闭
* */

//1.定义一个类实现Callable<V>接口
class MyCallable implements Callable<Integer>{

    // 2.重写call方法
    @Override
    public Integer call() throws Exception {

        // 3.将要执行的代码写在call方法中
        Random random = new Random();

        int i = random.nextInt(100);

        return i;
    }
}

public class ThreadTest03 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //4.创建ExecutorService线程池
        ExecutorService exec = Executors.newCachedThreadPool();


        //5.将自定义类的对象放入线程池里面
        //开启两个线程
        Future<Integer> result1 = (Future<Integer>) exec.submit(new MyCallable());
        Future<Integer> result2 = (Future<Integer>) exec.submit(new MyCallable());

        //判断线程是否计算完毕
        while (!result1.isDone()&&!result2.isDone()){
            System.out.println("等待线程计算完毕");
        }


        //6.获取线程的返回结果
        Integer i1=result1.get();
        Integer i2 = result2.get();

        System.out.println("线程执行后结果："+i1);
        System.out.println("线程执行后结果："+i2);

        //7.关闭线程池，不再接收新的线程，未执行完的线程不会被关闭
        exec.shutdown();


    }

}
