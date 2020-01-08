package com.movle.java.array;

/**
 * @ClassName ArrayAdd
 * @MethodDesc: TODO 数组扩容
 * @Author Movle
 * @Date 1/8/20 3:04 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class ArrayAdd {
    public static void main(String[] args) {
        int[] src={1,3,5,7,9};
        int[] target={2,4,6,8,10,12,14};


        System.out.println("拷贝前数组：");
        for(int i=0;i<src.length;i++){
            System.out.println(src[i]);
        }



        /*
            第一个参数：Object src 源数组
            第二个参数：int srcPos 从源数组中那个索引位置开始拷贝
            第三个参数：Object dest 目标数组
            第四个参数：int destPos  从目标数组中哪个索引位置开始放
            第五个参数：int length  拷贝的元素的个数
            下面方法执行结束之后，src数组中的元素就拷贝到dest数组中了
        */
        System.arraycopy(src,2,target,3,3);

        System.out.println("拷贝后数组：");
        for(int i=0;i<target.length;i++){
            System.out.println(target[i]);
        }

    }
}
