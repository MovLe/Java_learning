package com.movle.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateTest
 * @MethodDesc: TODO DateTest功能介绍
 * @Author Movle
 * @Date 1/8/20 5:58 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class DateTest {

    public static void main(String[] args) {

        //获取自 1970年1月1日 00时00分00秒 000毫秒 到当前的毫秒数
        long now = System.currentTimeMillis();
        System.out.println("自 1970年1月1日 00时00分00秒 000毫秒 到当前的毫秒数:"+now);

        //获取系统当前时间
        Date nowtime = new Date();
        System.out.println("系统当前时间:"+nowtime);

        Date d1=new Date(0);
        System.out.println("1970年1月1日的时间:"+d1);

        /*
        y表示年,M表示月,d表示日,H表示小时,m表示分钟,s表示秒,S表示毫秒
         */
        //日期格式化
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String strTime1 = sdf1.format(nowtime);
        String strTime2 = sdf2.format(nowtime);

        System.out.println("日期格式化方式1："+strTime1);
        System.out.println("日期格式化方式2："+strTime2);




    }
}
