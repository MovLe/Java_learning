package com.movle.java.basic;

/**
 * @ClassName StaticClass
 * @MethodDesc: static作用-类静态变量
 * @Author Movle
 * @Date 1/8/20 1:54 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class StaticClass {

    public static void main(String[] args) {

        staticVery svery=new staticVery();

        svery.setvName("京东");

        System.out.println("类中的变量："+svery.getvName());
        System.out.println("类中的静态变量："+svery.sName);

        svery=null;

        System.out.println("类中的静态变量,即使指针指向空："+svery.sName);



    }


}

class staticVery{

    private String vName;

    static String sName="阿里巴巴";


    public void setvName(String vname){
        this.vName=vname;
    }

    public String getvName(){
        return this.vName;
    }


}
