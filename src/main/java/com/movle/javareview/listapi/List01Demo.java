package com.movle.javareview.listapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName List01Demo
 * @MethodDesc: List集合带索引的使用方法
 * @Author Movle
 * @Date 11/7/20 9:05 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class List01Demo {
    public static void main(String[] args) {
        demo1();
    }

    /**
     * List带索引的方法
     */
    private static void demo1() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("a");

        System.out.println(list1);
        //add
        list1.add(3,"movle");
        System.out.println(list1);

        //remove
        list1.remove(1);
        System.out.println(list1);
        //set
        list1.set(4,"A");
        System.out.println(list1);

        System.out.println("list1集合中的第2个元素是:"+list1.get(2));
    }
}
