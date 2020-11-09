package com.movle.javareview.lambdaapi.demo03;

/**
 * @ClassName Person
 * @MethodDesc: 人物bean
 * @Author Movle
 * @Date 11/9/20 8:28 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
