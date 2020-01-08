package com.movle.java.array;

/**
 * @ClassName Room
 * @MethodDesc: TODO Room功能介绍
 * @Author Movle
 * @Date 1/8/20 1:18 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Room {

    private String id;
    private String type;
    private boolean isHold;


    Room(String id1,String type1,boolean isHold1){
        this.id=id1;
        this.type=type1;
        this.isHold=isHold1;
    }

    public void setId(String id1){
        this.id=id1;
    }

    public String getId(){
        return this.id;
    }

    public void setType(String type1){
        this.type=type1;
    }

    public String getType(){
        return this.type;
    }

    public void setIsHold(boolean ishold){
        this.isHold=ishold;
    }

    public boolean getIsHold(){
        return isHold;
    }

    @Override
    public String toString() {
        return "["+this.id+","+this.type+","+(this.isHold?"占用":"空闲")+"]";
    }
}
