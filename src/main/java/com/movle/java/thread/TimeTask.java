package com.movle.java.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TimeTask
 * @MethodDesc: TODO 定时任务
 * @Author Movle
 * @Date 1/9/20 6:22 下午
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


class MyTimeTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Movle是大帅哥");
    }
}

public class TimeTask {

    public static void main(String[] args) throws ParseException {

        Timer t = new Timer();


        t.schedule(new MyTimeTask(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-01-09 18:32:00 000"),1000);


    }


}
