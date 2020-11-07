package com.movle.javareview.mapapi;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @ClassName HashTableDemo
 * @MethodDesc: HashTable的使用
 *      线程安全
 *      单线程，速度慢
 *      HashTable不能存储null值null键
 * @Author Movle
 * @Date 11/8/20 2:18 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class HashTableDemo {
    public static void main(String[] args) {
        demo01();
    }

    /**
     * HashTable的用法，不能为空
     */
    private static void demo01() {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);

        System.out.println("HashMap:"+map);

        Hashtable<String,String> hashtable = new Hashtable<>();
        //NullPointerException
        //hashtable.put(null,"a");
        //hashtable.put("b",null);
        //hashtable.put(null,null);
        hashtable.put("a","a");
        System.out.println("HashTable:"+hashtable);


    }
}
