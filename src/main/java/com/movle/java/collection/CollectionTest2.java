package com.movle.java.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionTest2
 * @MethodDesc: TODO CollectionTest2功能介绍
 * @Author Movle
 * @Date 1/8/20 9:07 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CollectionTest2 {


    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(new Person("张三",19));
        c.add(new Person("李四",20));
        c.add(new Person("王五",21));
        c.add(new Person("赵六",22));


        System.out.println(c);
        System.out.println(c.size());

        Object[] o=c.toArray();

        for (int i = 0; i <o.length ; i++) {
            System.out.println(o[i]);
        }

        Person p =new Person("赵六",22);

        System.out.println("集合c是否包含p:"+c.contains(p));

        c.remove(p);
        System.out.println(c);


    }
}
