package com.movle.javareview.lambdaapi.demo02;

/**
 * @ClassName Demo03Lambda
 * @MethodDesc: 无参数无返回值的Lambda
 * @Author Movle
 * @Date 11/9/20 8:16 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
    需求:
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
 */
public class Demo03Lambda {
    public static void main(String[] args) {
        //调用invokeCook方法,参数是Cook接口,传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("做饭");
            }
        });

        //使用Lambda表达式,简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("做饭3");
        });
        //优化省略Lambda
        invokeCook(()-> System.out.println("做饭2"));
    }
    /**定义一个方法,参数传递Cook接口,方法内部调用Cook接口中的方法makeFood*/
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
