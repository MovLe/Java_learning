package com.movle.javareview.ob1;

/**
 * @ClassName StringTransDemo
 * @MethodDesc: 字符串与基本数据类型的相互转换
 *
 * @Author Movle
 * @Date 11/7/20 5:03 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class StringTransDemo {
    public static void main(String[] args) {
        //demo1();
        demo2();
    }

    /**
     * String类型转换为基本数据类型
     */
    private static void demo2() {
        int in1 = Integer.parseInt("100");
        double dou2 = Double.parseDouble("20.33");
        boolean boo = Boolean.parseBoolean("false");

        System.out.println(in1);
        System.out.println(dou2);
        System.out.println(boo);
    }

    /**
     * 基本数据类型转换为字符串类型
     */
    private static void demo1() {

        //基本数据类型转为字符串类型
        String s1 = 100+"";

        String s2 = Double.toString(20.9);

        String s3 = String.valueOf(true);

        System.out.println(s1+" "+s2+" "+s3);


    }
}
