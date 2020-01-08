package com.movle.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName IteraterTes
 * @MethodDesc: TODO Iterater集合迭代器的用法
 * @Author Movle
 * @Date 1/8/20 9:56 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class IteraterTest {

    public static void main(String[] args) {

        iterator1();
        iterator2();

    }

    public static void iterator1(){

        Collection c = new ArrayList();

        c.add(new Person("张三",19));
        c.add(new Person("李四",20));
        c.add(new Person("王五",21));
        c.add(new Person("赵六",22));

        //获取迭代器
        for(Iterator iterator =c.iterator();iterator.hasNext();){

            //向下转型
            Person p = (Person) iterator.next();
            System.out.println("for循环中使用迭代器：\n"+p.getName()+"..."+p.getAge());
        }




    }
    public static void iterator2(){

        Collection c = new ArrayList();

        c.add(new Person("张三",19));
        c.add(new Person("李四",20));
        c.add(new Person("王五",21));
        c.add(new Person("赵六",22));

        //获取迭代器
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            //向下转型
            Person p = (Person) iterator.next();

            System.out.println("while循环中使用迭代器：\n"+p.getName()+"..."+p.getAge());


        }
    }

}
