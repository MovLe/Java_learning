package com.movle.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName arrayToList
 * @MethodDesc: TODO 数组与集合的互换
 * @Author Movle
 * @Date 1/9/20 12:54 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class arrayToList {

    public static void main(String[] args) {


        listToArray();

        arrayToListt();

        intArrayToList();

        integerToList();
    }



    public static void listToArray(){

        List<String> list1=new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");

        //当集合转换数组时,数组长度如果是<=集合的size时,转换后的数组长度等于集合的size
        //如果数组的长度大于了size,分配的数组长度就和你指定的长度一样
        String[] array1 =list1.toArray(new String[3]);

        System.out.println("集合转数组：转变前的list1集合："+list1);
        System.out.println("集合转数组：转变后的array1数组："+array1);


    }


    public static void arrayToListt(){

        //数组转集合
        String[] array2={"x","j","k"};

        System.out.println("数组转集合：转变前的array2数组"+array2);

        //将数组转换成集合
        List<String> list= Arrays.asList(array2);

        //不能添加
        //list.add("d");是会报错的
        System.out.println("数组转集合：转变后的list集合(此集合不可以添加)："+list);

        //通过这种方式将listArray转换成真正的ArrayList
        ArrayList<String> arrayList=new ArrayList<String>(list);

        System.out.println("集合转集合：转换为可添加的arraylist集合"+arrayList);

    }

    //基本数据类型的数组转换成集合,会将整个数组当作一个对象转换，下面程序将会打印出list的对象地址
    public static void intArrayToList(){
        int[] arr={1,2,3,4,5};

        List<int[]> list = Arrays.asList(arr);

        System.out.println("基本数据类型的数组转换的集合："+list);


    }
    //将数组转换成集合,数组中的数据必须是引用数据类型
    public static void integerToList(){
        Integer[] arr2={11,22,33,44,55};

        List<Integer> list2=Arrays.asList(arr2);
        System.out.println("引用数据类型的数组转换的集合："+list2);

    }
}
