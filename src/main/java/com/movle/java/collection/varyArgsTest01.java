package com.movle.java.collection;

/**
 * @ClassName varyArgsTest01
 * @MethodDesc: TODO 可变参数
 * @Author Movle
 * @Date 1/9/20 12:46 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class varyArgsTest01 {

    public static void main(String[] args) {

        print1(1,2,3,4,5);

        print2("meinv",6,7,8,9,10);

    }

    //可变参数其实是一个数组
    public static void print1(int ... arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }

    //如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
    public static void print2(String s,int ... arg){
        for (int i = 0; i <arg.length ; i++) {
            System.out.println(arg[i]);
        }
    }
}
