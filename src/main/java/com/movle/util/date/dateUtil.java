package com.movle.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

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

        System.out.println("randomTime sec:"+generateRandoTime(3,1));
        System.out.println("randomTime:"+generateRandoTime(3,2));

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

    /**
     * 随机层次mouth个月内的时间，type=1时带时分秒，type=2时不带时分秒
     * @param month
     * @param type
     * @return
     */
    public static Date generateRandoTime(int month, int type) {
        Calendar calendar = Calendar.getInstance();
        Random random = new Random();
        if(month != 1) {
            int randomMonth = random.nextInt(month-1);
            calendar.add(Calendar.MONTH, randomMonth);
        }
        int randomDay = random.nextInt(30);
        calendar.add(Calendar.DAY_OF_MONTH, randomDay);
        if (1 == type) {
            int randomHour = random.nextInt(23);
            int randomMin = random.nextInt(59);
            int randomSec = random.nextInt(59);
            calendar.add(Calendar.HOUR_OF_DAY, randomHour);
            calendar.add(Calendar.MINUTE, randomMin);
            calendar.add(Calendar.SECOND, randomSec);
        } else if (2 == type) {
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
        }
        return calendar.getTime();
    }
}
