package com.movle.javareview.collectionAPI;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionRegularAPI
 * @MethodDesc: Collection集合的通用方法
 *      boolean add(E e);       //向集合中添加元素
 *      boolean remove(E e);	//删除集合中的某个元素
 *      void clear();  			//清空集合中的所有元素
 *      boolean contains(E e);  //判断集合中是否包含某个元素
 *      boolean isEmpty();		//判断集合是否为空
 *      int size();				//获取集合的长度
 *      Object[] toArray();		//将集合转换为一个数组
 * @Author Movle
 * @Date 11/7/20 5:30 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CollectionRegularAPI {
    public static void main(String[] args) {

        demo1();
    }

    private static void demo1() {
        Collection<String> coll = new ArrayList<>();

        //add添加元素
        coll.add("hello");
        coll.add("world");
        coll.add("big");
        coll.add("super");
        System.out.println("添加内容后的集合："+coll);

        //remove删除某个元素
        boolean removeResult = coll.remove("big");
        System.out.println("删除元素成功与否："+removeResult+" 删除后的集合:"+coll);

        //contains包含
        System.out.println("集合是否包含元素:"+coll.contains("hello"));

        //isEmpty是否为空
        System.out.println("判断集合是否为空："+coll.isEmpty());

        //size集合的长度
        System.out.println("集合的长度："+coll.size());

        //toArray转换为数组
//        Collection<Integer> in1 = new ArrayList<>();
//        in1.add(100);
//        in1.add(200);
//        in1.add(90);
//        in1.add(900);

        Object[] s1 = coll.toArray();
        for (Object o : s1) {
            System.out.println(o);
        }

        //clear清楚所有元素
        coll.clear();
        System.out.println(coll);

    }
}
