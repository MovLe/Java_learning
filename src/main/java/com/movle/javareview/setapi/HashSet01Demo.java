package com.movle.javareview.setapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName hashSet01Demo
 * @MethodDesc: HashSet的使用
 *      不允许存储重复的元素
 *      没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 *      是一个无序的集合，存储元素的取出元素的顺序有可能不一样
 *      底层是一个哈希表结构(查询的速度非常快)
 * @Author Movle
 * @Date 11/7/20 10:05 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class HashSet01Demo {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        //使用迭代器遍历
        System.out.println("=====迭代器遍历=====");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer e = it.next();
            System.out.println(e);
        }

        System.out.println("=====增强for循环遍历=====");
        //使用增强for循环遍历
        for (Integer e:set) {
            System.out.println(e);
        }


    }
}
