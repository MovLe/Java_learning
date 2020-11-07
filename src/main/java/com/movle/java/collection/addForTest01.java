package com.movle.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName addForTest01
 * @MethodDesc: TODO 增强for循环
 * @Author Movle
 * @Date 1/9/20 12:25 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class addForTest01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
