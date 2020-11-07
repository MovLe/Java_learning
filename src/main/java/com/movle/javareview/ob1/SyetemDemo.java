package com.movle.javareview.ob1;

/**
 * @ClassName SyetemDemo
 * @MethodDesc:  Syetem类的常用方法
 *      public static Long currentTimeMillis():返回以毫秒为单位的当前时间
 *      public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int Length):将数组中指定的数据拷贝到另一个数组中
 *                                  src - 源数组 srcPos -源数组起始位置 dest - 目标数组 destPos - 目标数组起始位置 Length - 要复制的数组元素的个数
 *  @Author Movle
 * @Date 11/7/20 3:48 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SyetemDemo {

    public static void main(String[] args) {
        //demo1();
        demo2();
    }

    /**
     * 数组拷贝System类中的arraycopy方法
     */
    private static void demo2() {
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        int srcPos = 0;
        int destPos= 0;
        int Length=3;
        System.out.println("拷贝前的数组");
        for (int i = 0; i <src.length ; i++) {
            System.out.print(src[i]+" ");
        }
        System.out.println();
        for (int j = 0; j <dest.length; j++) {
            System.out.print(dest[j]+" ");
        }

        System.arraycopy(src,srcPos,dest,destPos,Length);

        System.out.println();
        System.out.println("拷贝后的数组");
        for (int k = 0;  k<src.length ; k++) {
            System.out.print(src[k]+" ");
        }
        System.out.println();
        for (int j = 0; j <dest.length; j++) {
            System.out.print(dest[j]+" ");
        }

    }


    /**
     * 获取以毫秒为单位9999次循环所用的时间
     */
    private static void demo1() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("循环所用时间为："+(end-start));

    }
}

