package com.movle.javareview.genericapi;

/**
 * @ClassName MyInterImpl
 * @MethodDesc: 泛型接口实现
 * @Author Movle
 * @Date 11/7/20 7:25 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class MyInterImpl<O> implements MyInter<O> {
    @Override
    public void print(O o) {
        System.out.println(o);
    }
}
