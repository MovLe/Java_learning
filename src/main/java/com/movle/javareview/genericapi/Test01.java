package com.movle.javareview.genericapi;

/**
 * @ClassName Test01
 * @MethodDesc: 泛型类和泛型方法，泛型接口和泛型方法
 * @Author Movle
 * @Date 11/7/20 7:21 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Test01 {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    /**
     * 泛型类和泛型方法
     */
    private static void demo1() {
        System.out.println("========泛型类和泛型方法=======");
        MyClass<String> mc1 = new MyClass<>();
        mc1.print("hello ");

        MyClass<Integer> mc2 = new MyClass<>();
        mc2.print(99);

    }

    /**
     * 泛型接口和泛型方法
     */
    private static void demo2(){
        System.out.println("========泛型接口和泛型方法=======");
        MyInterImpl<String> mi1 = new MyInterImpl<>();
        mi1.print("world");

        MyInterImpl<Double> mi2 = new MyInterImpl<>();
        mi2.print(99.99);
    }
}
