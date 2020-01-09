package com.movle.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName IoTest01
 * @MethodDesc: TODO IoTest01功能介绍
 * @Author Movle
 * @Date 1/9/20 3:17 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class IoTest01 {

    public static void main(String[] args) throws IOException {

        IOTestRead01();

        IOTestRead02();

        IOTestWrite01();

    }

    public static void IOTestRead01() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/macbook/Documents/development/inbox/movle.txt");

        byte[] bytes= new byte[3];

        int temp;

        while((temp = fileInputStream.read(bytes)) != -1){

            System.out.println(new String(bytes, 0, temp));
        }
    }

    public static void IOTestRead02(){


        System.out.println("将movle.txt文件读取到jvm内存中，并将里面的内容在控制台打印");
        FileInputStream fil=null;

        try {
            fil=new FileInputStream("/Users/macbook/Documents/development/inbox/movle.txt");

            int v1 = fil.read();
            int v2 = fil.read();
            int v3 = fil.read();

            System.out.println((char)v1);
            System.out.println((char)v2);
            System.out.println((char)v3);


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fil!=null){
                try {
                    fil.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void IOTestWrite01() throws FileNotFoundException {

        FileOutputStream fos=null;

        fos=new FileOutputStream("/Users/macbook/Documents/development/inbox/out.txt");

        String msg = "hello world";

        byte[] bytes= msg.getBytes();

        try {
            fos.write(bytes);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
