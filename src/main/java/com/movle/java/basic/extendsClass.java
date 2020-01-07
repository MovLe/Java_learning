package com.movle.java.basic;

/**
 * @ClassName extendsClass
 * @MethodDesc: JAVA面向对象之继承
 * @Author macbook
 * @Date 1/8/20 2:11 上午
 * @Version 1.0
 * @Email ma342221@163.com
 **/


public class extendsClass {



    public static void main(String[] args) {

        subClass s = new subClass();
        s.m0();
        s.m1();
        s.m2();
        s.m3();
    }
}


class superSuperClass{
    public void m0(){
        System.out.println("这是superSuperClass中的m0方法");
    }
}

class superClass extends superSuperClass{
    public void m1(){
        System.out.println("这是superClass中的m1方法");
    }
    public void m2(){
        System.out.println("这是superClass中的m2方法");
    }

}

class subClass extends superClass{
    public void m3(){
        System.out.println("这是subClass中的m3方法");
    }
}