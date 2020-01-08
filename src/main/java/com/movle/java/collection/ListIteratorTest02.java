package com.movle.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName ListIteratorTest02
 * @MethodDesc: TODO ListIteratorTest02功能介绍
 * @Author Movle
 * @Date 1/8/20 11:39 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ListIteratorTest02 {


    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("a");
        list.add("b");
        list.add("ticket");
        list.add("c");
        list.add("d");


        ListIterator listIterator = list.listIterator();

        //在ListIterator中有个previous()和hasPrevious()方法，通过这两个方法，可以将集合中的元素倒序遍历。需要注意的是在倒序遍历之前要将集合先正序遍历。
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }
}
