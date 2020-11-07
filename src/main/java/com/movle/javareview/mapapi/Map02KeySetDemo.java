package com.movle.javareview.mapapi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Map02KeySetDemo
 * @MethodDesc: 使用keySet方法遍历Map
 *      (1)Map集合的第一种遍历方式：通过键找值
 *          Map集合中的方法：
 * 	            Set<K> keySet() 返回此映射中包含的键的Set视图
 *          实现步骤：
 * 	            1.使用Map集合中的keySet()方法，把Map集合所有的key取出来，存储到一个Set集合中
 * 	            2.遍历Set集合，获取Map集合中的每一个key
 * 	            3.通过Map集合中的方法get(key)，通过key找到value
 * @Author Movle
 * @Date 11/8/20 1:15 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Map02KeySetDemo {

    public static void main(String[] args) {
        demo01();
    }

    /**
     * 使用keySet方法遍历Map
     */
    private static void demo01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("林志玲",18);
        map.put("吴亦凡",38);
        map.put("林志颖",28);
        map.put("赵忠祥",48);
        map.put("成龙",57);

        Set<String> set = map.keySet();

        for(String k:set){
            Integer value = map.get(k);
            System.out.println(k+"="+value);
        }

    }
}
