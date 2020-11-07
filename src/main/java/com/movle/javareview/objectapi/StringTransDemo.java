package com.movle.javareview.objectapi;

/**
 * @ClassName StringTransDemo
 * @MethodDesc: 字符串与基本数据类型的相互转换
 *      (1)基本数据类型转换为字符串
 *          a.基本类型数据与“”相连接即可
 *              String s1=100+"";
 *              String s2=28.02+"";
 *          b.使用包装类中的静态方法
 *              static String toString(int i)       //返回一个指定整数的String对象
 *          c.使用String类中的静态方法
 *              static String valueOf(int i)        //返回int参数的字符串表示形式
 *      (2)String类型转换为对应的基本类型：使用包装类的静态方法parseXX("字符串")方法
 *          public static byte parseByte(String s)     //将字符串转换为对应的byte基本类型
 *          public static short parseShort(String s)     //将字符串转换为对应的Short基本类型
 *          public static int parseInt(String s)     //将字符串转换为对应的int基本类型
 *          public static long parseLong(String s)     //将字符串转换为对应的long基本类型
 *          public static float parseFloat(String s)     //将字符串转换为对应的float基本类型
 *          public static double parseDouble(String s)     //将字符串转换为对应的double基本类型
 *          public static boolean parseBoolean(String s)     //将字符串转换为对应的boolean基本类型
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
