package com.movle.java.basic;

/*
    char的取值范围：0~65536
    unicode对应的码值
        'a'  97
        'A'   65
        '0'   48

*/
public class CharType {
    public static void main(String[] args) {
        char c1='a';
        //汉子占用2个字节，所以java中的char可以存储一个汉字。
        char c2='中';

        //赋予相应的unicode值
        char c3 = 97;
        char c4=65;
        char c5=48;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }

}
