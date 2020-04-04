package com.movle.java.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LambdaTest01
 * @MethodDesc: TODO Lambda表达式
 * @Author Movle
 * @Date 1/9/20 2:54 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class LambdaTest01 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        System.out.println("普通for循环遍历list");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Lambda表达式，foreach遍历list");

        list.forEach((Integer n) -> {System.out.println(n);});

        System.out.println("--Java 8新增方法引用，方法引用由::双冒号操作符标示--");
        list.forEach(System.out::println);

    }
}
