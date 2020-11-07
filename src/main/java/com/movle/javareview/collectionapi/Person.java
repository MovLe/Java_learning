package com.movle.javareview.collectionapi;

/**
 * @ClassName Person
 * @MethodDesc: 重写compareTo方法自定义排序规则
 * @Author Movle
 * @Date 11/7/20 11:32 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Person implements Comparable<Person>{
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        /*年龄生序排列*/
        return this.getAge()-o.getAge();

        //return 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }
}
