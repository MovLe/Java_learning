package com.movle.javareview.lambdaapi.demo03;

import java.util.Arrays;
import java.util.Comparator;



/**
 * @ClassName Demo04Lambda
 * @MethodDesc: Lambda表达式有参数有返回值的练习
 * @Author Movle
 * @Date 11/9/20 8:30 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo04Lambda {
    public static void main(String[] args) {
        Person[] arr1 = {
                new Person("刘德华",30),
                new Person("刘亦菲",29),
                new Person("张学友",33),
                new Person("艾薇儿",18),
                new Person("成龙",55)
        };

        Person[] arr2 = {
                new Person("刘德华",30),
                new Person("刘亦菲",29),
                new Person("张学友",33),
                new Person("艾薇儿",18),
                new Person("成龙",55)
        };
        Person[] arr3 = {
                new Person("刘德华",30),
                new Person("刘亦菲",29),
                new Person("张学友",33),
                new Person("艾薇儿",18),
                new Person("成龙",55)
        };

        demo01(arr1);
        demo02(arr2);
        demo03(arr3);

    }

    /**
     * 使用匿名内部类
     * @param arr
     */
    private static void demo01(Person[] arr) {

        System.out.println("======匿名内部类========");
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        printArr(arr);
    }

    /**
     * Lambda简化匿名内部类
     * @param arr
     */
    private static void demo02(Person[] arr) {
        System.out.println("======Lambda简化匿名内部类========");
        //使用Lambda表达式,简化匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });
        printArr(arr);
    }
    /**
     * 优化简略Lambda
     */
    private static void demo03(Person[] arr) {
        System.out.println("======优化简略Lambda========");
        Arrays.sort(arr,(o1,o2)->o1.getAge()-o2.getAge());
        printArr(arr);
    }

    /**
     * 打印数组
     * @param arr
     */
    private static void printArr(Person[] arr) {
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
