package com.movle.java.basic;

/**
 * @ClassName superClass
 * @MethodDesc: 关键字super
 * @Author Movle
 * @Date 1/8/20 2:36 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class superClassFile {

    public static void main(String[] args) {
        catAnimal c= new catAnimal();

        c.m1();
    }
}

class Animal{

    public String name = "动物";
    public void eat(){
        System.out.println("吃东西");
    }

    public void sleep(){
        System.out.println("睡觉");
    }



}

class catAnimal extends Animal{

    public String name = "莉莉";

    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void m1(){
        System.out.println("父类中动物的名字叫："+super.name);
        System.out.println("猫的名字叫："+this.name);

        super.eat();
        this.eat();
    }
}

class dogAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
