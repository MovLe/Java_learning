package com.movle.javareview.genericapi;

import java.util.ArrayList;

/**
 * @ClassName Test02
 * @MethodDesc: 泛型通配符
 *      泛型的通配符
 * 	        ？：代表任意的数据类型
 *      使用方式：
 * 	        不能创建对象使用
 * 	        只能作为方法的参数使用
 *      泛型的上限限定
 * 	        ？ extends E 代表使用的泛型只能是E类型的子类/本身
 *      泛型类的下限限定
 * 	        ？ super E 代表使用的泛型只能是E类型的父类/本身
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

        System.out.println("========泛型通配符=======");
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


    /**
     * 泛型通配符的使用
     */
    private static void print(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
