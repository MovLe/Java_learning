package com.movle.javareview.threadapi.demo08.synchronizedapi;

/**
 * @ClassName RunnableImpl
 * @MethodDesc: 线程同步
 * @Author Movle
 * @Date 11/8/20 10:10 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
    卖票案例出现了线程安全问题
    卖出了不存在的票和重复的票

    解决线程安全问题的二种方案:使用同步方法
    使用步骤:
        1.把访问了共享数据的代码抽取出来,放到一个方法中
        2.在方法上添加synchronized修饰符

    格式:定义方法的格式
    修饰符 synchronized 返回值类型 方法名(参数列表){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
    }
 */
public class RunnableImpl implements Runnable {
    /**定义一个多线程共享的资源*/
    private int ticket = 100;
    private static int ticket2=100;

    @Override
    public void run() {
        System.out.println("this:"+this);
        while(true){
            //payTickt();
            //payTickt2();
            //payTicktStatic();
            payTicktStatic2();
        }
    }

    /**
     *   静态的同步方法
     *   锁对象是谁?
     *   不能是this
     *   this是创建对象之后产生的,静态方法优先于对象
     *   静态方法的锁对象是本类的class属性-->class文件对象(反射)
     */
    public static synchronized void payTicktStatic() {
        if(ticket2>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket2+"张票");
            ticket2--;
        }
    }

    private static void payTicktStatic2() {
        synchronized (RunnableImpl.class){
            if(ticket2>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket2+"张票");
                ticket2--;
            }
        }
    }


    /**
     * 定义一个同步方法
     * 同步方法也会把方法内部的代码锁住
     * 只让一个线程执行
     * 同步方法的锁对象是谁?
     * 就是实现类对象 new RunnableImpl()
     * 也是就是this
     */
    private synchronized void payTickt() {
        if(ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
            ticket--;
        }
    }
    private void payTickt2(){
        synchronized (this){
            if(ticket>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
