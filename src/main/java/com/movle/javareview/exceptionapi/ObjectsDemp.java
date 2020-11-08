package com.movle.javareview.exceptionapi;

import sun.tools.jconsole.inspector.XObject;

import java.util.Objects;

/**
 * @ClassName ObjectsDemp
 * @MethodDesc: Objects类中的静态方法，查看指定引用对象是否为空
 * @Author Movle
 * @Date 11/8/20 10:27 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ObjectsDemp {
    public static void main(String[] args) {
        demo01(null);
    }

    private static void demo01(Object obj) {

        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递对象的值是null");
    }
}
