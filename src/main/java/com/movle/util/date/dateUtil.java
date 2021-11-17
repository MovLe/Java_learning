package com.movle.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName dateUtil
 * @MethodDesc: Date的相关常用代码
 * @Author Movle
 * @Date 2021/11/17 下午2:13
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class dateUtil {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date:"+date);
        System.out.println("DateToString dateString:"+dateToString(date));
        String dateString = "2021-11-17 14:30:56";
        System.out.println("stringToDate date:"+stringToDate(dateString));
    }

    /**
     * DateToString
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    /**
     * StringToDate
     * @param dateString
     * @return
     */
    public static Date stringToDate(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
