package com.movle.java.array;

import java.util.Scanner;

/**
 * @ClassName HotelCheck
 * @MethodDesc: 酒店预定系统
 * @Author Movle
 * @Date 1/8/20 2:04 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/

/*
* 酒店房间管理系统需求

有家酒店一共有5层，每层有10个房间，其中：
1，2层是标准间
3，4层是双人间
5层是豪华间
根据以前所学习的知识实现一个酒店房间管理系统，需要提供房间状态查看，房间预定、退房的功能。


需求分析

先来抽象，既然要做酒店房间管理系统，那么就会跟酒店和房间打交道，因此将这两个对象使用Java语言表现出来：
首先需要定义一个Room类，里面存储房间编号，房间类型，是否空房
其次需要定义一个Hotel类，里面存储所有房间的基本信息。里面提供预定、退房、查看房间状态的方法。
最后需要定义一个Test类，用来接收用户的输入，从而提供房间服务。
*
* */


public class HotelCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎入住本酒店，酒店房间信息如下：");

        Hotel hotel=new Hotel();

        hotel.print();

        while(true){
            System.out.println("若您有什么需求，请输入对应的数字：\n1.预定房间   2.退房");

            String order = scanner.next();

            if("1".equals(order)){
                System.out.println("请输入想要预定的房间号：");
                String roomeid =scanner.next();
                System.out.println("房间id"+roomeid);
                hotel.checkIn(roomeid);

                System.out.println("房间已预定");

            }else if("2".equals(order)){
                System.out.println("请输入想要退房的房间号：");
                String roomeid =scanner.next();
                System.out.println("房间id"+roomeid);
                hotel.checkOut(roomeid);
                System.out.println("房间已退房");

            }else {

                System.out.print("请输入预定或者退房");
            }
            hotel.print();

        }

    }

}
