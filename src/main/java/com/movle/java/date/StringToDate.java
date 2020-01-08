package com.movle.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName StringToDate
 * @MethodDesc: TODO StringToDate功能介绍
 * @Author Movle
 * @Date 1/8/20 6:16 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class StringToDate {
    public static void main(String[] args) {
        String strTime="2020年01月08日 00:00:00 000";

        //格式不能随意，应该和上面的字符串格式相同。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");

        Date d=new Date();

        try {
            d=sdf.parse(strTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("String类型转为Date类型:\n其中String为:"+strTime+"\nDate类型为:"+d);

    }
}
