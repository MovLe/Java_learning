package com.movle.java.io;

import java.io.*;

/**
 * @ClassName FileCopy
 * @MethodDesc: TODO IO拷贝
 * @Author Movle
 * @Date 1/9/20 3:44 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class FileCopy {

    public static void main(String[] args) {
        copyTest01();
        copyBufferTest01();
    }

    public static void copyTest01(){

        System.out.println("利用IO流拷贝文件");
        FileInputStream fis= null;
        FileOutputStream fos=null;

        try {
            fis = new FileInputStream("/Users/macbook/Documents/development/inbox/movle.txt");
            fos = new FileOutputStream("/Users/macbook/Documents/development/inbox/out2.txt");

            byte[] bytes = new byte[1024];

            int length=0;

            while((length=fis.read(bytes))!=-1){
                fos.write(bytes,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void copyBufferTest01(){

        System.out.println("使用缓冲流进行文件拷贝");
        BufferedInputStream bis = null;
        BufferedOutputStream bos =null;

        try {
            bis = new BufferedInputStream(new FileInputStream("/Users/macbook/Documents/development/inbox/movle.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("/Users/macbook/Documents/development/inbox/out3.txt"));

            int temp;

            while((temp=bis.read())!=-1){
                bos.write(temp);
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
