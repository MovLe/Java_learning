package com.movle.java.collection;


import java.util.Objects;

/**
 * @ClassName Person
 * @MethodDesc: TODO Person功能介绍
 * @Author Movle
 * @Date 1/8/20 8:52 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Person {
    private String name;
    private int age;

    Person(){

    }

    Person(String name1,int age1){

        this.name=name1;
        this.age=age1;
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

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
            if(this.name.equals(p.getName())&&this.age==p.getAge()){
                return  true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
