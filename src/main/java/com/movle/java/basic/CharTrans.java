package com.movle.java.basic;

public class CharTrans {
    public static void main(String[] args) {
        // 斜线在java语言中有转义功能，可以将普通t字符，转换成“制表符”
        char c1='\t';

        //这是一个普通的“单引号”字符
        char c2='\'';

        //这是一个普通的“双引号”字符
        char c3='\"';

        //这是一个普通的“斜线”字符
        char c4 = '\\';

        //这是一个普通的换行符
        char c5 = '\n';



        System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3);

        System.out.println(c4);

        System.out.println("good");

        System.out.println("day 换行");

        System.out.print("good");

        System.out.print("day 不换行");

        System.out.println();
        System.out.print("good");

        System.out.print(c5);
        System.out.print("day 换行符换行");







    }
}
