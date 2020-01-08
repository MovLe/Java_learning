package com.movle.java.excption;

/**
 * @ClassName RegisterTest
 * @MethodDesc: TODO RegisterTest功能介绍
 * @Author Movle
 * @Date 1/8/20 11:16 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RegisterTest {


    public static void main(String[] args) {
        String name="mkmkmkmk";

        UserService ur = new UserService();

        try {
            ur.register(name);
        } catch (IllegalNameException e) {
            e.printStackTrace();
        }


    }

}
