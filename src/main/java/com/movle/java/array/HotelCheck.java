package com.movle.java.array;

import java.util.Scanner;

/**
 * @ClassName HotelCheck
 * @MethodDesc: TODO HotelCheck功能介绍
 * @Author Movle
 * @Date 1/8/20 2:04 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


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
