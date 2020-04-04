package com.movle.java.array;

/**
 * @ClassName ArrayMax
 * @MethodDesc: 数组的最大值
 * @Author Movle
 * @Date 1/8/20 12:30 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ArrayMax {

    public static void main(String[] args) {
        int[] number = {1,3,2,54,33,9,432};

        System.out.println("数组的最大值为："+max(number));
    }

    public static int max(int[] num){
        int max=num[0];
        for(int i=0;i<num.length;i++)
        {

            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }
}
