package com.movle.java.collection;

import java.util.HashSet;

/**
 * @ClassName HashSetTest01
 * @MethodDesc: TODO HaseSet测试set不能有重复值
 * @Author Movle
 * @Date 1/9/20 9:48 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class HashSetTest01 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        boolean b1= hs.add("a");
        boolean b2= hs.add("a");

        hs.add("b");
        hs.add("c");
        hs.add("d");


        System.out.println(hs);
        System.out.println("第一次添加a的结果"+b1);
        System.out.println("第二次添加a的结果："+b2);

        for(String s:hs){
            System.out.println(s);
        }
    }
}
