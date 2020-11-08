package com.movle.javareview.threadapi.demo10waitandnotify;

/**
 * @ClassName WaitAndNotifyAllDemo
 * @MethodDesc: NotifyAll的使用
 * @Author Movle
 * @Date 11/9/20 12:05 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


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
