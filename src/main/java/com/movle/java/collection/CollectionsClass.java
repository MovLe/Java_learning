package com.movle.java.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName CollectionsClass
 * @MethodDesc: TODO 工具类Collections的使用
 * @Author Movle
 * @Date 1/9/20 2:10 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CollectionsClass {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(9);
        list.add(15);

        System.out.println("原list："+list);
        System.out.println("list中的最大值"+Collections.max(list));
        Collections.reverse(list);
        System.out.println("反转后的list："+list);

        Collections.shuffle(list);
        System.out.println("洗牌后的list："+list);

        Collections.sort(list);
        System.out.println("排序后的list："+list);

        System.out.println("二分法查找"+Collections.binarySearch(list,6));



    }
}
