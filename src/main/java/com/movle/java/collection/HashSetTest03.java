package com.movle.java.collection;

/**
 * @ClassName HashSetTest03
 * @MethodDesc: TODO 生成10个1~20之间的整数，并且这些整数不能重复
 * @Author Movle
 * @Date 1/9/20 10:36 上午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


import java.util.HashSet;
import java.util.Random;

/**
 * 问题：生成10个1~20之间的整数，并且这些整数不能重复
 * 分析：HashSet的特点就是里面的元素不会重复，因此将生成的随机数放入到HashSet中，直到HashSet的size为10即可
 */

public class HashSetTest03 {

    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();

        Random random = new Random();

        while(hs.size()<10){
            int a = random.nextInt(20)+1;

            hs.add(a);
        }


        System.out.println(hs);

        for(Integer integer:hs){
            System.out.println(integer);
        }

    }
}
