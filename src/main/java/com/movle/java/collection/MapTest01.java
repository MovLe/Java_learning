package com.movle.java.collection;

import java.util.*;

/**
 * @ClassName MapTest01
 * @MethodDesc: TODO Map知识
 * @Author Movle
 * @Date 1/9/20 11:44 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class MapTest01 {

    public static void main(String[] args) {

        //map的基础操作
        mapTest();

        //map的遍历方式1
        mapErgodic01();

        //map的遍历方式2
        mapErgodic02();

        //LinkedHashMap
        LinkedHashMapTest();

        //TreeMap
        TreeMapTest();

    }

    public static void mapTest(){
        System.out.println("-------map的基础操作--------");
        Map<Integer,String> map = new HashMap<>();

        String s1 = map.put(1001,"成龙");
        map.put(1002,"张学友");
        map.put(1003,"刘德华");
        map.put(1004,"张国荣");

        System.out.println(s1);
        System.out.println("map为："+map);

        String s2=map.put(1001,"房祖名");
        System.out.println("返回被替换的成龙"+s2);
        System.out.println("map为："+map);

        System.out.println("查看是否包含key：1001"+map.containsKey(1001));
        System.out.println("查看是否包含value：刘德华"+map.containsValue("刘德华"));

        System.out.println("获取map的大小："+map.size());


        Collection<String> collection=map.values();
        System.out.println("将map的值转换为集合："+collection);
        System.out.println("map为："+map);

        //删除键是1001的数据并且将值返回
        String s3 = map.remove(1003);
        System.out.println("被删除的key为1003的value值"+s3);
        System.out.println("删除key为1003之后的map"+map);

    }

    public static void mapErgodic01(){

        System.out.println("-------map迭代方式1--------");
        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"成龙");
        map.put(1002,"张学友");
        map.put(1003,"刘德华");
        map.put(1004,"张国荣");

        // 获取map中所有的键返回给Set
        Set<Integer> keySet = map.keySet();


        System.out.println("使用迭代器迭代");
        //遍历set获取键，根据键获取值
        Iterator<Integer> iterator=keySet.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();

            System.out.println("key为:"+key+" value为:"+map.get(key));
        }


        System.out.println("for循环迭代");
        //使用增强for循环遍历
        for(Integer integer:keySet){
            System.out.println("key为:"+integer+" value为:"+map.get(integer));
        }

    }

    public static void mapErgodic02(){
        System.out.println("-------map迭代方式2--------");
        Map<Integer,String> map = new HashMap<>();
        map.put(1001,"成龙");
        map.put(1002,"张学友");
        map.put(1003,"刘德华");
        map.put(1004,"张国荣");

        //键和值被封装成了Entry对象,并存储在Set集合中
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();

        Iterator<Map.Entry<Integer,String >> iterator = entrySet.iterator();

        while(iterator.hasNext()){

            //获取每一个Entry对象
            Map.Entry<Integer,String> en=iterator.next();

            //根据键值对对象获取键
            Integer integer = en.getKey();

            //根据键值对对象获取值
            String value =en.getValue();

            System.out.println("使用Entry编辑map的键为："+integer+"值为："+value);

        }

        System.out.println("增强for循环使用Entry迭代：");
        for(Map.Entry en:entrySet){
            System.out.println("键："+en.getKey()+"值："+en.getValue());
        }
    }
    public static void LinkedHashMapTest(){

        System.out.println("-------LinkedHaseMap--------");
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1003,"成龙");
        map.put(1001,"张学友");
        map.put(1002,"刘德华");
        map.put(1004,"张国荣");


        System.out.println(map);



    }

    public static void TreeMapTest(){

        System.out.println("-------TreeHaseMap--------");

        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1003,"成龙");
        map.put(1001,"张学友");
        map.put(1002,"刘德华");
        map.put(1004,"张国荣");


        System.out.println(map);

    }
}
