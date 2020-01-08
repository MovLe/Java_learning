package com.movle.java.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionTest
 * @MethodDesc: TODO Collection集合
 * @Author Movle
 * @Date 1/8/20 8:20 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CollectionTest {

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");


        System.out.println(c.size());
        System.out.println(c);

        c.remove("b");
        System.out.println(c);

        c.clear();
        System.out.println(c);

        Collection d = new ArrayList();
        d.add("a");
        d.add("b");
        d.add("c");
        d.add("d");

        //集合转为数组
        Object[] o = d.toArray();
        System.out.println("集合转为数组的结果：");
        for(int i=0;i<o.length;i++){
            System.out.println(o[i]);
        }

        System.out.println("d集合是否包含b："+d.contains("b"));

        System.out.println("c集合是否为空"+c.isEmpty());

    }

}
