package com.movle.javareview.objectAPI;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName CalendarDemo
 * @MethodDesc:  Calendar类的常用的成员方法
 * @Author Movle
 * @Date 11/7/20 2:25 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CalendarDemo {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //getCalendar();
        //setCalendar();
        //addCalendar();
        getCalendarTime();


    }

    /**
     * 把日历对象转换为日期对象
     */
    private static void getCalendarTime() {
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);

    }

    /**
     * 把指定的字段增加/减少指定的值
     */
    private static void addCalendar() {

        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-3);

        int year = c.get(Calendar.YEAR);

        int mouth = c.get(Calendar.MONTH);

        int day = c.get(Calendar.DATE);
        System.out.println("年："+year+" 月："+(mouth+1)+" 日："+day);

    }

    /**
     * 设置年月日
     */
    private static void setCalendar() {
        Calendar c = Calendar.getInstance();
        //单独设置年月日
        c.set(Calendar.YEAR,2022);
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DATE,23);

        //同时设置年月日
        c.set(2020,10,7);

        int year = c.get(Calendar.YEAR);

        int mouth = c.get(Calendar.MONTH);

        int day = c.get(Calendar.DATE);
        System.out.println("年："+year+" 月："+(mouth+1)+" 日："+day);


    }

    /**
     * 获取年月日
     */
    private static void getCalendar() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        int mouth = c.get(Calendar.MONTH);

        int day = c.get(Calendar.DATE);
        System.out.println("年："+year+" 月："+(mouth+1)+" 日："+day);


    }

}
