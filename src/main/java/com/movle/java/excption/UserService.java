package com.movle.java.excption;

/**
 * @ClassName UserService
 * @MethodDesc: TODO UserService功能介绍
 * @Author Movle
 * @Date 1/8/20 10:59 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class UserService {
    public void register(String name) throws IllegalNameException{

        if(name.length()<6){
            throw new IllegalNameException();
        }

        System.out.println("注册成功");

    }
}

