package com.movle.javareview.genericAPI;

import java.util.ArrayList;

/**
 * @ClassName Test02
 * @MethodDesc: 泛型通配符
 * @Author Movle
 * @Date 11/7/20 7:13 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Test02 {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.add("beatiful");
        print(list1);

        ArrayList<Integer> list2 =  new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(500);
        print(list2);
    }

    private static void print(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
