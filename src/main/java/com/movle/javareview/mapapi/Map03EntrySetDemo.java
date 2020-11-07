package com.movle.javareview.mapapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Map03EntrySetDemo
 * @MethodDesc: Map遍历的第二种方法，使用Entry对象遍历
 *      (2)Map集合的第二种遍历方式：使用Entry对象遍历
 *          Map集合中的方法：
 * 	            Set <Map.Entry<K,V>> entrySet()  返回此映射中包含的映射关系的Set视图
 *          实现步骤：
 * 	            1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
 * 	            2.遍历Set集合，获取每一个Entry对象
 * 	            3.视图Entry对象中的方法getKey()和getValue()获取键和值
 * @Author Movle
 * @Date 11/8/20 1:31 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Map03EntrySetDemo {

    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("林志玲",18);
        map.put("吴亦凡",38);
        map.put("林志颖",28);
        map.put("赵忠祥",48);
        map.put("成龙",57);

        Set<Map.Entry<String,Integer>> set = map.entrySet();

        System.out.println("========使用迭代器遍历=========");
        Iterator<Map.Entry<String,Integer>> it = set.iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> m = it.next();
            String K = m.getKey();
            Integer V = m.getValue();

            System.out.println(K+"="+V);
        }
        System.out.println("========增强for循环遍历=========");
        for (Map.Entry<String,Integer> m:set) {
            String Key = m.getKey();
            Integer Value = m.getValue();
            System.out.println(Key+"="+Value);
        }

    }
}
