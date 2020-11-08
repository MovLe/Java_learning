package com.movle.javareview.threadapi.demo10waitandnotify;

/**
 * @ClassName WaitAndNotifyAllDemo
 * @MethodDesc: NotifyAll的使用
 * @Author Movle
 * @Date 11/9/20 12:05 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/Blocked状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class WaitAndNotifyAllDemo {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子种类和数目");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("包子已经做好类，开吃");
                        System.out.println("==============================");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while(true){
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子种类和数目");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        System.out.println("包子已经做好类，开吃");
                        System.out.println("==============================");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        obj.notifyAll();
                        System.out.println("包子已经做好了");
                    }

                }
            }
        }.start();
    }
}
