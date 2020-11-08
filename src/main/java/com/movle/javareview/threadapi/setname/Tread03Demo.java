package com.movle.javareview.threadapi.setname;

/**
 * @ClassName Tread03Demo
 * @MethodDesc: 给线程改名
 * @Author Movle
 * @Date 11/8/20 4:08 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Tread03Demo {
    public static void main(String[] args) {

//        demo01();
        demo02();
    }

    /**
     * 用父类给子线程起名
     */
    private static void demo02() {
       new My03Thread("小明").start();

    }

    /**
     * 利用setName方法改变名称
     */
    private static void demo01() {
        My03Thread mt = new My03Thread();

        //给线程起名
        mt.setName("美女");
        mt.start();
    }
}
