package com.movle.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName deleteIteratorTest
 * @MethodDesc: TODO 集合框架中的三种迭代方式删除数据
 * @Author Movle
 * @Date 1/9/20 12:29 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class deleteIteratorTest {

    /*
    * 普通for循环,可以删除,注意让索引做自减运算
    * 迭代器,可以删除,但是必须使用迭代器自身的remove方法,否则会出现并发修改异常
    * 增强for循环不能删除
    * */
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");

        for (int i = 0; i <list.size() ; i++) {
            if("b".equals(list.get(i))){
                list.remove(i);
                System.out.println("for循环删除");
            }
        }


        for(Iterator iterator = list.iterator();iterator.hasNext();){
            if("e".equals(iterator.next())){
                iterator.remove();
                System.out.println("迭代器删除");
            }
        }

        for(String s:list){
            if("g".equals(s)){
                list.remove("g");
                System.out.println("增强for循环删除");
            }
        }


        System.out.println(list);

    }
}
