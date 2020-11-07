package com.movle.javareview.listapi;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LinkedList01Demo
 * @MethodDesc: LinkedList首尾元素的常用方法
 *      (1)LinkedList集合的特点
 *          底层是一个链表结构：查询慢，增删块
 *          里边包含了大量操作首尾元素的方法
 *
 *      (2)常用方法
 *          public void addFrist(E e);   //将指定元素插入到此列表的开头
 *          public void addLast(E e);		 //将指定元素插入到此列表的结尾
 *          public void push(E e);			 //将元素推入此列表所表示的堆栈
 *
 *          public E getFrist();         //返回此列表的第一个元素
 *          public E getLast();					 //返回此列表的最后一个元素
 *
 *          public E removeFrist();			 //移除并返回此列表的第一个元素
 *          public E removeLast();			 //移除并返回此列表的最后一个元素
 *          public E pop();							 //从此列表所表示的堆栈处弹出一个元素
 * ```
 * @Author Movle
 * @Date 11/7/20 9:30 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class LinkedList01Demo {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        demo03();
    }



    /**
     * 移除元素
     */
    private static void demo03() {

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        System.out.println("原集合"+list2);

        System.out.println("removeFrist "+list2.removeFirst()+list2);
        System.out.println("removeLast "+list2.removeLast()+list2);
        System.out.println("pop "+list2.pop()+list2);

    }

    /**
     * 获取元素的方法
     */
    private static void demo02() {
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        System.out.println("原集合"+list1);

        System.out.println("getFrist:"+list1.getFirst());
        System.out.println("getLast:"+list1.getLast());

    }

    /**
     * LinkedList的添加方法
     */
    private static void demo01() {
        LinkedList<String> list1 = new LinkedList<>();
        System.out.println("原集合"+list1);

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");

        //addFrist
        list1.addFirst("www");
        System.out.println("添加首"+list1);

        //push
        list1.push("push");
        System.out.println("push方法"+list1);

        //addLast
        list1.addLast("movle");
        System.out.println("添加尾"+list1);


    }
}
