package com.movle.java.basic;

/**
 * @ClassName ObjectParms
 * @MethodDesc: 参数传递之值传递
 * @Author Movle
 * @Date 1/8/20 1:37 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ObjectParms {



    public static void mulAge(Animals a){
        int age=a.getAge();

        a.setAge(++age);

        System.out.println("mulAge中的年龄为"+a.getAge());
    }


    public static void main(String[] args) {

        Animals a= new Animals();
        a.setAge(10);


        mulAge(a);

        System.out.println("main函数中的年龄为"+a.getAge());

    }


}

class Animals{

    private int age;

    public void setAge(int age1){
        this.age = age1;
    }

    public int getAge(){
        return this.age;
    }
}
