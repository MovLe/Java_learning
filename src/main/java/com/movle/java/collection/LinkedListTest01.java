package com.movle.java.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LinkedListTest01
 * @MethodDesc: TODO LinkedList的特殊用法
 * @Author Movle
 * @Date 1/9/20 12:06 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class LinkedListTest01 {

    public static void main(String[] args) {
        List<String > list1 = new LinkedList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("f");

        System.out.println("原Linkedlist"+list1);

        System.out.println("Linkedlist的get方法的到的值："+list1.get(1));

        LinkedList list2 = new LinkedList();
        list2.addFirst("a");
        list2.addFirst("b");
        list2.addFirst("c");
        list2.addFirst("d");

        list2.addLast("z");

        System.out.println(list2);

        System.out.println("得到第一个："+list2.getFirst());
        System.out.println("得到最后一个："+list2.getLast());

        System.out.println("移除第一个："+list2.removeFirst());
        System.out.println("移除最后一个："+list2.removeLast());

        System.out.println(list2);





    }
}
