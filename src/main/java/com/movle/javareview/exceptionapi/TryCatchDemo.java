package com.movle.javareview.exceptionapi;

import java.io.IOException;

/**
 * @ClassName TryCatchDemo
 * @MethodDesc:  try...catch的使用方法
 * @Author Movle
 * @Date 11/8/20 11:20 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class TryCatchDemo {

    public static void main(String[] args) {

        try {
            readFile("/User/a.tx");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件后缀名不是.txt");
        }
        System.out.println("后续代码");
    }

    private static void readFile(String filename) throws IOException {

        if(!filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("文件的后缀名正确");
    }
}
