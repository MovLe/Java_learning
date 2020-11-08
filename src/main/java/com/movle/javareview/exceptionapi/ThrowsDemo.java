package com.movle.javareview.exceptionapi;

import java.io.FileNotFoundException;

/**
 * @ClassName ThrowsDemo
 * @MethodDesc: Throws关键字的使用
 * @Author Movle
 * @Date 11/8/20 10:41 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {

        readFile("/User/macbook/TestInfo");
    }

    private static void readFile(String filename) throws FileNotFoundException {
        String path="/User/macbook/TestInfo";
        if(!path.equals(filename)){
            throw new FileNotFoundException("传递的文件路径不正确");
        }
        System.out.println("文件路径正确");
    }
}
