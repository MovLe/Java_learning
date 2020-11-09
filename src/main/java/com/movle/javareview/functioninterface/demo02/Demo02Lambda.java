package com.movle.javareview.functioninterface.demo02;

/**
 * @ClassName Demo02Lambda
 * @MethodDesc:
 * @Author Movle
 * @Date 11/9/20 12:25 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/**
 *     使用Lambda优化日志案例
 *     Lambda的特点:延迟加载
 *     Lambda的使用前提,必须存在函数式接口
 */
public class Demo02Lambda {

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        //调用showLog方法,参数MessageBuilder是一个函数式接口,所以可以传递Lambda表达式
        showLog(2,()->{
            return msg1+msg2+msg3;
        });

        /**
            使用Lambda表达式作为参数传递,仅仅是把参数传递到showLog方法中
            只有满足条件,日志的等级是1级
                才会调用接口MessageBuilder中的方法builderMessage
                才会进行字符串的拼接
            如果条件不满足,日志的等级不是1级
                那么MessageBuilder接口中的方法builderMessage也不会执行
                所以拼接字符串的代码也不会执行
            所以不会存在性能的浪费
         */
        showLog(1,()->{
            System.out.println("不满足条件，不执行");
            return msg1+msg2+msg3;
        });

    }

    /**
     * 定义一个显示日志的方法,方法的参数传递日志的等级和MessageBuilder接口
     * @param level
     * @param mb
     */
    public static void showLog(int level,MessageBuilder mb){
        if(level==1){
            System.out.println(mb.builderMessage());
        }
    }
}
