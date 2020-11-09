package com.movle.javareview.lambdaapi.demo04;

/**
 * @ClassName Demo05Lambda
 * @MethodDesc: Lambda表达式有参数有返回值的练习
 * @Author Movle
 * @Date 11/9/20 8:55 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo05Lambda {
    public static void main(String[] args) {
        //调用invokeCal方法,方法的参数是一个接口,可以使用匿名内部类
        invokeCal(1, 2, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //使用Lambda表达式简化匿名内部类的书写
        invokeCal(3,4,(int a,int b)->{
            return a+b;
        });

        //优化省略Lambda
        invokeCal(5,6,(a,b)->a+b);
    }
    /**
        定义一个方法
        参数传递两个int类型的整数
        参数传递Calculator接口
        方法内部调用Calculator中的方法calc计算两个整数的和
     */
    public static void invokeCal(int a,int b,Calculator calculator){
        int result=calculator.calc(a,b);
        System.out.println(result);
    }
}
