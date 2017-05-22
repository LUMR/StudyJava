package com.lumr.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 带阻塞的倒计时
 * Created by lumr on 2017/5/22.
 */
public class SleepingTask extends LiftOff {
    public SleepingTask() {
    }

    public SleepingTask(int countDown) {
        super(countDown);
    }

    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                TimeUnit.SECONDS.sleep(1);//睡眠计时
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new SleepingTask(25));
        exec.shutdown();
        System.out.println("main线程终止");
    }
}
