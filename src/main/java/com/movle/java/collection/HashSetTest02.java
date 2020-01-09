package com.movle.java.collection;

import java.util.HashSet;

/**
 * @ClassName HashSetTest02
 * @MethodDesc: TODO HashSetTest02功能介绍
 * @Author Movle
 * @Date 1/9/20 10:00 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class HashSetTest02 {

    public static void main(String[] args) {

        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",19));
        hs.add(new Person("张三",19));
        hs.add(new Person("李四",20));
        hs.add(new Person("李四",20));
        hs.add(new Person("李四",20));

        System.out.println(hs);

        for(Person p:hs){
            System.out.println(p);
        }


    }
}
