package com.movle.java.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @ClassName LinkedHashSetTest01
 * @MethodDesc: TODO LinkedHashSetTest01功能介绍
 * @Author Movle
 * @Date 1/9/20 11:20 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class LinkedHashSetTest01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("e");


        System.out.println("去重前list集合为："+list);

        LinkedHashSet<String> list2=new LinkedHashSet<>();


        list2.addAll(list);
        System.out.println("LinkedHashSet集合："+list2);
        list.clear();

        list.addAll(list2);

        System.out.println("去重后的list集合"+list);

    }
}

