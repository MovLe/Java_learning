package com.movle.javareview.exceptionapi;

/**
 * @ClassName RegisterException
 * @MethodDesc: 自定义异常类的使用
 * @Author Movle
 * @Date 11/8/20 12:16 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RegisterException extends Exception{

    public RegisterException() {
        super();
    }

    public RegisterException(String message) {
        super(message);
    }
}
