package com.movle.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/**
 * @ClassName ListIterator
 * @MethodDesc: TODO List遍历修改元素时的问题，此时迭代器用ListIterator而不是Iterator
 * @Author Movle
 * @Date 1/8/20 11:13 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ListIterTest {

    public static void main(String[] args) {

        List list =new ArrayList();
        list.add("a");
        list.add("b");
        list.add("monkey");
        list.add("c");
        list.add("d");

        ListIterator listIter = list.listIterator();

        while(listIter.hasNext()){
            String str = (String) listIter.next();

            if(str.equals("monkey")){
                listIter.add("1024");
            }
        }

        System.out.println(list);

    }
}
