package com.movle.java.array;

/**
 * @ClassName ArrayExchange
 * @MethodDesc: 数组元素交换
 * @Author Movle
 * @Date 1/8/20 12:34 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ArrayExchange {

    public static void main(String[] args) {

        int[] num={1,3,4,5,9};

        System.out.println("交换前数组为");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        exchange(num);

        System.out.println("交换后数组为");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

    public static void exchange(int[] num){
        for(int i=0;i<num.length/2;i++){
            //length=4
            //{9,7,5,3,1}
            //num[0]=num1[4]=num1[num.length-1-0]
            //num[1]=num1[3]=num1[num.length-1-1]

            int mid=num[i];
            num[i]=num[num.length-1-i];
            num[num.length-1-i]=mid;
        }
    }
}
