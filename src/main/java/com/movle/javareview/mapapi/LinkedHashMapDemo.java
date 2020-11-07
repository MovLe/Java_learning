package com.movle.javareview.mapapi;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @ClassName LinkedHashMapDemo
 * @MethodDesc: LinkedHashMap的使用方式
 *      有序
 *      不重复
 * @Author Movle
 * @Date 11/8/20 2:12 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class LinkedHashMapDemo {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println("HashMap:"+map);

        LinkedHashMap<String,String> map2 = new LinkedHashMap<>();
        map2.put("a","a");
        map2.put("c","c");
        map2.put("b","b");
        map2.put("a","d");
        System.out.println("LinkedHashMap:"+map2);
    }
}
