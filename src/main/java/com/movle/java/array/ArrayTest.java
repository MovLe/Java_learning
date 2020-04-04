package com.movle.java.array;

/**
 * @ClassName ArrayTest
 * @MethodDesc: 一维数组声明的两种方式
 * @Author Movle
 * @Date 1/8/20 12:06 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ArrayTest {

    public static void main(String[] args) {

        int[] intArray1={10,20,30};
        int[] intArray2= new int[5];

        System.out.println("数组第一个元素"+intArray1[0]);
        System.out.println("数组第一个元素"+intArray1[1]);
        System.out.println("数组第一个元素"+intArray1[2]);

        System.out.println("数组的长度"+intArray1.length);

        System.out.println("遍历数组1");
        for(int i=0;i<intArray1.length;i++){
            System.out.println(intArray1[i]);
        }

        int k=100;
        intArray2[0]=100;
        for(int i=1;i<intArray2.length;i++){
            intArray2[i]=intArray2[i-1]+k;
        }
        System.out.println("遍历数组2");
        for(int i=0;i<intArray2.length;i++){
            System.out.println(intArray2[i]);
        }
    }
}
