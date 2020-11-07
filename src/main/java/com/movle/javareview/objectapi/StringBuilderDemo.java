package com.movle.javareview.objectapi;

/**
 * @ClassName StringBuilderDemo
 * @MethodDesc: StringBuilder常用的方法
 *      append():添加内容，可以是int,char,String,double
 *      reverse():反转StringBuilder中的字符串
 *      toString():将StringBuiler类型转换为String类型
 * @Author Movle
 * @Date 11/7/20 4:14 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class StringBuilderDemo {
    public static void main(String[] args) {
        //demo1();
        demo2();

    }

    /**
     * StringBuilder类的reverse方法
     */
    private static void demo2() {
        StringBuilder sb = new StringBuilder("abcdefg");
        System.out.println("反转之前"+sb.toString());

        sb.reverse();
        System.out.println("反转之后"+sb.toString());

    }

    /**
     * StringBuilder的append方法
     */
    private static void demo1() {
        StringBuilder sb = new StringBuilder();
        sb.append("你好");
        System.out.println(sb);

        sb.append(" 世界");
        System.out.println(sb);
        sb.append(111);
        sb.append('c');
        sb.append(2.8);
        sb.append("Hello Wolrd");

        System.out.println(sb.toString());
        sb.append(1).append("中国").append('爱').append(10086);


        System.out.println(sb.toString());
    }
}
