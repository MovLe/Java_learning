package com.movle.java.array;

/**
 * @ClassName TwoArray
 * @MethodDesc: 二维数组
 * @Author Movle
 * @Date 1/8/20 12:51 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class TwoArray {
    public static void main(String[] args) {
        int[][] num2={
                {1,2,3},
                {4,5,6}
        };
        int[][] num3 = new int[3][4];

        int mid=100;
        for(int i=0;i<num3.length;i++){
            for(int j=0;j<num3[i].length;j++){


                num3[i][j]=mid+100;

                mid=mid+100;
            }
        }


        System.out.println("遍历数组num2");
        for(int i=0;i<num2.length;i++){

            for(int j=0;j<num2[i].length;j++)
            {
                System.out.print(num2[i][j]+" ");
            }

        }

        System.out.println("\n遍历数组num3");
        for(int i=0;i<num3.length;i++){

            for(int j=0;j<num3[i].length;j++)
            {
                System.out.print(num3[i][j]+" ");
            }

        }

    }
}
