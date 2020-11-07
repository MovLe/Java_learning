package com.movle.javareview.collectionapi;

/**
 * @ClassName Student
 * @MethodDesc: 用于Collections工具类sort比较的第二种方法
 * @Author Movle
 * @Date 11/8/20 12:04 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
