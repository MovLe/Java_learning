package com.movle.javareview.collectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName IteratorAPI
 * @MethodDesc: Iterator迭代器的常用方法
 *      常用方法
 * 	        boolean hasNext()   //如果仍有元素可以迭代，则返回true判断集合是否还有元素
 * 	        E next()			//返回迭代的下一个元素，取出集合中的下一个元素
 *      Iterator迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
 *      Collection接口中有一个方法iterator()，这个方法返回的就是迭代器的实现类对象
 *
 *      迭代器的使用步骤(重点)：
 * 	        1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
 * 	        2.使用Iterator接口中的方法hasNext()判断是否还有元素
 * 	        3.使用Iterator接口中的方法next()取出集合中的下一个元素
 * @Author Movle
 * @Date 11/7/20 5:51 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class IteratorAPI {
    public static void main(String[] args) {
        demo1();
    }

    /**
     * 使用迭代器遍历集合
     */
    private static void demo1() {
        Collection<String> coll = new ArrayList<>();
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("杜兰特");
        coll.add("库里");
        coll.add("乔丹");

        Iterator<String> it = coll.iterator();

        while(it.hasNext()){
           String e = it.next();
            System.out.println("我最爱的球星有："+e);
        }


    }
}
