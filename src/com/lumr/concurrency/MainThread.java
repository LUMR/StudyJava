package com.lumr.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * 普通调用，不是单线程驱动
 * Created by lumr on 2017/5/22.
 */
public class MainThread {
    public static void main(String[] args) {
        test();
        daemon();
    }

    //单一线程模式，跟MAIN一个线程
    public static void test(){
        LiftOff launch = new SleepingTask(10);
        launch.run();
    }

    //后台线程模式,当所以非后台线程结束时会强行结束所有后台
    public static void daemon(){
        Thread thread = new Thread(new SleepingTask());
        thread.setDaemon(true);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
