package com.movle.javareview.functioninterface.demo03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName Demo03Comparator
 * @MethodDesc: 当一个方法的返回值是一个函数式接口，那么就可以返回一个Lambda表达式
 * @Author Movle
 * @Date 11/9/20 12:42 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */
public class Demo03Comparator {
    public static void main(String[] args) {

        String[] arr = {"aaa","b","ccccc","ddddddddddddd"};
        //[aaa, b, ccccc, ddddddddddddd]
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,getComparator1());
        //[ddddddddddddd, ccccc, aaa, b]
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 方法的返回值类型是一个接口,那么我们可以返回这个接口的匿名内部类
     */
    public static Comparator<String> getComparator1(){
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };
    }

    /**
     * 方法的返回值类型是一个函数式接口,所有我们可以返回一个Lambda表达式
     */
    public static Comparator<String> getComparator2(){
        return (String o1,String o2)->{
            return o2.length()-o1.length();
        };
    }

    /**
     * 继续优化Lambda表达式
     */
    public static Comparator<String> getComparator3(){
        return (o1,o2)->o2.length()-o1.length();
    }
}
