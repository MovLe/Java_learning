package com.movle.javareview.exceptionapi;

import java.util.Scanner;

/**
 * @ClassName RegisterExceptionDemo
 * @MethodDesc: 测试自定义的异常类
 * @Author Movle
 * @Date 11/8/20 1:31 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RegisterExceptionDemo {
    static String[] usernames = {"张三","李四","王五"};

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String usrname = sc.next();
        //checkUserName01(usrname);
        checkUserName02(usrname);
    }

    private static void checkUserName02(String usrname) {
        for (String s:usernames) {
            if(s.equals(usrname)){
                throw new RegisterRuntimeException("RuntimeException该用户名已注册");
            }

        }
    }


    public static void checkUserName01(String usrname)  {
        for (String s:usernames) {
            if(s.equals(usrname)){
                try {
                    throw new RegisterException("Exception该用户名已注册");
                }catch (RegisterException e){
                    e.printStackTrace();
                    return;
                }
            }
        }

        System.out.println("恭喜，该用户已注册成功！");
    }
}
