package com.movle.javareview.objectAPI;

/**
 * @ClassName IntgerDemo
 * @MethodDesc: 包装类的使用
 *      装箱
 *          构造方法
 * 	            Integer(int value)       //构造一个新分配的Integer对象，它表示指定的int值
 * 	            Integer(String s)				 //构造一个新分配的Integer对象，它表示String参数所指的int值 如“100” 注意：“a”是不行的
 *          静态方法
 * 	            static Integer valueOf(int value)   //返回一个表示指定int值的Integer实例
 * 	            static Integer ValueOf(String s)    //返回保存指定的String的值的Integer对象
 *          成员方法(拆箱)
 * 	            int intValue()  //以int类型返回该Integer的值
 * @Author Movle
 * @Date 11/7/20 4:34 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class IntgerDemo {
    public static void main(String[] args) {
        demo1();
    }

    /**
     * 装箱
     */
    private static void demo1() {
        //构造方法
        Integer in1 = new Integer(1);
        Integer in2 = new Integer("100");
        System.out.println("构造方法产生的"+in1+" "+in2);

        //静态方法
        Integer in3 = Integer.valueOf(2);
        Integer in4 = Integer.valueOf("200");
        System.out.println("静态方法产生的"+in3+" "+in4);

        //拆箱
        int i = in1.intValue();
        System.out.println("拆箱后的值："+i);

    }
}
