package com.movle.javareview.mapapi;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Map01Demo
 * @MethodDesc: Map集合的常用方法
 * @Author Movle
 * @Date 11/8/20 12:41 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Map01Demo {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        //demo03();
        demo04();
    }

    /**
     * Map之判断集合中是否包含指定的键
     */
    private static void demo04() {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("林志玲",18);
        map.put("吴亦凡",38);
        map.put("林志颖",28);
        map.put("赵忠祥",48);
        map.put("成龙",57);

        System.out.println("判断是否存在吴亦凡："+map.containsKey("吴亦凡"));
        System.out.println("判断是否存在吴亦凡2："+map.containsKey("吴亦凡2"));

    }

    /**
     * Map之get方法
     */
    private static void demo03() {

        Map<String,Integer> map = new HashMap<>();
        map.put("林志玲",18);
        map.put("吴亦凡",38);
        map.put("林志颖",28);
        map.put("赵忠祥",48);
        map.put("成龙",57);

        System.out.println("get林志玲的值："+map.get("林志玲"));

    }

    /**
     * Map之删除元素
     */
    private static void demo02() {

        Map<String,Integer> map = new HashMap<>();
        map.put("林志玲",18);
        map.put("吴亦凡",38);
        map.put("林志颖",28);
        map.put("赵忠祥",48);
        map.put("成龙",57);
        System.out.println("删除前的map"+map);

        int v = map.remove("成龙");
        System.out.println("删除的元素为:"+v+"删除后的map集合："+map);

    }

    /**
     * Map之添加元素
     */
    private static void demo01() {
        Map<String,String> map = new HashMap<>();

        String s1 = map.put("李晨","范冰冰");
        System.out.println("添加成功返回元素"+s1+" map集合:"+map);
        map.put("杨过","小龙女");
        map.put("文章","马伊琍");
        map.put("邓超","孙俪");
        map.put("周星驰","成龙");
        map.put("吴亦凡","秦香莲");

        System.out.println("添加元素完毕：map"+map);

    }
}
