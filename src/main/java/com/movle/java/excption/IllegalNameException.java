package com.movle.java.excption;

/**
 * @ClassName IllegalNameException
 * @MethodDesc: TODO IllegalNameException功能介绍
 * @Author Movle
 * @Date 1/8/20 10:56 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class IllegalNameException extends Exception {
    public IllegalNameException() {
        super();
    }
    public IllegalNameException(String msg){
        super(msg);
    }
}
