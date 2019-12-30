package com.movle.java.basic;


/*
 * @Author Movle
 * @Description TODO 功能简介
 * @Date 5:01 下午 12/30/19
 * @Param
 * @return
 **/
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

/*

    常见的字符编码

    ASCII 编码:美国信息互换标准代码， 用一个字节来编码。
    ISO-8859-1 字符编码:是国际化标准组织位西欧语言制定的编码， 它用一个字节来为字符编码， 与 ASCII 编码兼容。
    GB2312 字符编码:它包括对简体中文字符的编码。
    GBK 字符编码:它是对 GB2312 编码的扩展， 收录了更多的中文字符。
    Unicode 字符编码:收录了全世界所有语言文字中的字符

    char的取值范围：0~65536
    unicode对应的码值
        'a'  97
        'A'   65
        '0'   48
 */