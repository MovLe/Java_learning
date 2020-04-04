package com.movle.java.array;

/**
 * @ClassName Hotel
 * @MethodDesc: TODO Hotel功能介绍
 * @Author Movle
 * @Date 1/8/20 1:39 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Hotel {

    private Room[][] rooms;

    Hotel(){

        //房间共有5层，每层10个房间
        rooms = new Room[5][10];

        //初始化每个房间
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){

                if(i==0|i==1){
                    rooms[i][j]=new Room(((i+1)*100)+j+1+"","标准间",false);
                }else if(i==2|i==3){
                    rooms[i][j]=new Room(((i+1)*100)+j+1+"","双人间",false);
                }else{
                    rooms[i][j]=new Room(((i+1)*100)+j+1+"","豪华间",false);
                }

            }
        }

    }

    public void print(){
        System.out.println("本酒店所含有的房间如下：");
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                System.out.print(" "+rooms[i][j].getId()+" "+rooms[i][j].getType()+" "+(rooms[i][j].getIsHold()?"占用":"空闲"));
            }
            System.out.println();
        }

    }

    public void checkIn(String id){
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){

                if(rooms[i][j].getId().equals(id)){
                    rooms[i][j].setIsHold(true);

                    System.out.println(rooms[i][j].getId()+"房间状态"+rooms[i][j].getIsHold());
                    return;
                }

            }
        }
    }

    public void checkOut(String id){
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){

                if(rooms[i][j].getId().equals(id)){
                    rooms[i][j].setIsHold(false);
                    return;
                }
            }
        }
    }
}
