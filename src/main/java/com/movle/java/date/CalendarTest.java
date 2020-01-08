package com.movle.java.date;

import java.util.Calendar;

/**
 * @ClassName CalendarTest
 * @MethodDesc: TODO CalendarTest功能介绍
 * @Author Movle
 * @Date 1/8/20 6:26 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CalendarTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //外国人将周日看做是第一天
        int i = c.get(Calendar.DAY_OF_WEEK);


        System.out.println("今天是一周的第"+i+"天");
    }
}
