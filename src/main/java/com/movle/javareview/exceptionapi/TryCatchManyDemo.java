package com.movle.javareview.exceptionapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TryCatchManyDemo
 * @MethodDesc: 多个异常使用捕获的处理方法
 * @Author Movle
 * @Date 11/8/20 11:44 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class TryCatchManyDemo {
    public static void main(String[] args) {
        //demo01();
        //demo02();
        demo03();
    }

    /**
     * 多个异常分别处理
     */
    private static void demo01() {
        int[] arr ={1,2,3};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try{
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码！");

    }

    /**
     * 多个异常一次捕获，多次处理
     *      catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则会报错
     */
    private static void demo02() {
        int[] arr ={1,2,3};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        try{
            System.out.println(arr[3]);
            System.out.println(list.get(3));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码！");
    }

    /**
     * 多个异常一次捕获，一次处理
     */
    private static void demo03() {
        int[] arr ={1,2,3};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        try{
            System.out.println(arr[3]);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
