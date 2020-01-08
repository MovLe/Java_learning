package com.movle.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListMethod
 * @MethodDesc: TODO List集合特有的方法
 * @Author Movle
 * @Date 1/8/20 10:30 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ListMethod {

    public static void main(String[] args) {

        addTest();
        removeTest();
        getTest();
        setTest();
    }

    private static void setTest() {

        List list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //将指定位置的元素修改
        list.set(1,"z");

        System.out.println("setTest:"+list);
    }

    private static void getTest() {

        List list =new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Object obj = list.get(2);


        System.out.println("getTest中get的内容："+obj);

        //通过索引遍历List集合
        for (int i = 0; i <list.size() ; i++) {

            System.out.println(list.get(i));
        }


    }


    public static void  removeTest(){

        List list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //通过索引删除元素,将被删除的元素返回
        Object o = list.remove(1);

        System.out.println("removeTest中remove的元素："+o);
        System.out.println("removeTest:"+list);

    }

    public static void addTest(){

        List list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //index<=size且index>=0都不会报异常
        list.add(1,"k");
        list.add(4,"p");


        //java.lang.IndexOutOfBoundsException,当存储时使用不存在的索引时
        list.add(10, "z");

        System.out.println("addTest:"+list);

    }

}
