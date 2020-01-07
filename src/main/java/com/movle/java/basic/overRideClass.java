package com.movle.java.basic;

/**
 * @ClassName overRideClass
 * @MethodDesc: 重写override
 * @Author Movle
 * @Date 1/8/20 2:26 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class overRideClass {



    public static void main(String[] args) {

        Cat liLi = new Cat();
        Dog jiuJiu= new Dog();

        liLi.eat();
        jiuJiu.eat();

    }

}


class AnimalsType{

    public void eat(){
        System.out.println("吃东西");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
class Cat extends AnimalsType{
    @Override
    public void eat(){
        System.out.println("吃猫粮");
    }
}

class Dog extends AnimalsType{
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }

}