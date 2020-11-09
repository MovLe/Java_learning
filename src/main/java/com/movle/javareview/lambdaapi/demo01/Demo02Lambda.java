package com.movle.javareview.lambdaapi.demo01;

/**
 * @ClassName Demo02Lambda
 * @MethodDesc: 使用lambda表达式简化代码
 * @Author Movle
 * @Date 11/9/20 8:01 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


/**
    Lambda表达式的标准格式:
        由三部分组成:
            a.一些参数
            b.一个箭头
            c.一段代码
        格式:
            (参数列表) -> {一些重写方法的代码};
        解释说明格式:
            ():接口中抽象方法的参数列表,没有参数,就空着;有参数就写出参数,多个参数使用逗号分隔
            ->:传递的意思,把参数传递给方法体{}
            {}:重写接口的抽象方法的方法体
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新线程创建2");
        }).start();

        //优化省略Lambda
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"新线程创建3")).start();

    }
}
