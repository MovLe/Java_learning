package com.movle.java.basic;

/**
 * @ClassName StudentObject
 * @MethodDesc: 普通类
 * @Author macbook
 * @Date 1/8/20 1:05 上午
 * @Version 1.0
 * @Email ma342221@163.com
 **/


public class StudentObject {


    public static void main(String[] args) {
        Person zhangSan = new Person(1,"zhangshan",true,18);


        zhangSan.study("高数");
        zhangSan.fallInLove("李志安");


        Person liSi = new Person();

        liSi.name="lisi";
        liSi.sex=false;
        liSi.age=19;
        liSi.id=2;

        liSi.study("数据结构");
        liSi.fallInLove("马月");


    }

}

class Person{

    String name;
    Boolean sex;
    int age;
    int id;

    Person(){

    }

    Person(int id1,String name1,Boolean sex1,Integer age1){
        this.id=id1;
        this.name=name1;
        this.sex=sex1;
        this.age=age1;
    }


    public void study(String TextClass){

        System.out.println(this.name+"学习了"+TextClass);
    }

    public void fallInLove(String Name){
        System.out.println(this.name+"和"+Name+"相爱了");
    }

}
