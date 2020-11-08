package com.movle.javareview.exceptionapi;

/**
 * @ClassName RegisterRuntimeException
 * @MethodDesc: 运行期异常
 * @Author Movle
 * @Date 11/8/20 1:44 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class RegisterRuntimeException extends RuntimeException{
    public RegisterRuntimeException() {
        super();
    }

    public RegisterRuntimeException(String message) {
        super(message);
    }
}
