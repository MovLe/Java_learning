package com.movle.javareview.collectionapi;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName CollectionsAPI
 * @MethodDesc: Collections工具类的使用
 *      1.用法
 *          public static <T> boolean addAll(Collection<T> c,T...elements);    //往集合中添加一些元素
 *          public static void shuffle(List<?> list);					       //打乱集合的顺序
 *          public static <T> void sort(List<T> list);				           //将集合中元素按照默认规则排序
 *          public static <T> void sort(List<T> list,Comparator<? super T>);   //将集合中元素按照指定规则排序
 *
 *      2.注意
 *          (1)sort(List<T> list)使用前提：
 *              被排序的集合里面存储的元素，必须实现comparable，重写接口中的方法compareTo定义排序的规则
 *
 *          (2)Comparable接口的排序规则：
 *              自己(this)-参数  ：升序
 *              参数-自己(this)：降序
 * @Author Movle
 * @Date 11/7/20 11:19 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CollectionsAPI {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        demo03();
    }

    /**
     * Collections工具类sort排序之自定义类型的排序
     * 自己(this)-参数 ：升序
     * 参数-自己(this)：降序
     */
    private static void demo03() {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("张三",18));
        person.add(new Person("李四",20));
        person.add(new Person("王武",15));
        System.out.println("排序前的集合：person"+person);

        Collections.sort(person);
        System.out.println("排序后的集合：person"+person);
    }

    /**
     * Collections工具类之排序
     */
    private static void demo02() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(9);
        list1.add(8);
        System.out.println("排序前的集合:list1"+list1);

        Collections.sort(list1);
        System.out.println("排序后的集合:list1"+list1);
    }

    /**
     * Collections工具类的单次加入多个元素与打乱集合顺序
     */
    private static void demo01() {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        System.out.println("多次加入单个元素：list1"+list1);

        //添加多个元素
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"a","b","c","d","e");
        System.out.println("单次加入多个元素：list2"+list2);

        //打乱顺序
        Collections.shuffle(list1);
        System.out.println("打乱顺序后的集合：list1"+list1);

    }
}
