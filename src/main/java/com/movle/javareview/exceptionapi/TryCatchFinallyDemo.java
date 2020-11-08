package com.movle.javareview.exceptionapi;

import java.io.IOException;

/**
 * @ClassName TryCatchFinallyDemo
 * @MethodDesc: try...finally的使用
 * @Author Movle
 * @Date 11/8/20 1:51 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class TryCatchFinallyDemo {

    public static void main(String[] args) {
        try {
            readFile("/User/macbook/TestInfo/a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
    }

    private static void readFile(String filename) throws IOException {
        if(!filename.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }

        System.out.println("路径没有问题，读取文件");

    }

}
