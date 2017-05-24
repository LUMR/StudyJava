package com.lumr.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * 自管理的线程类
 * Created by lumr on 2017/5/24.
 */
public class SelfManager implements Runnable {
    private int id;
    PrintString ps = new PrintString("顺序1");
    Thread thread = new Thread(this);

    public SelfManager() {
        System.out.println("顺序2");
        thread.start();
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        id = 5;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " Id: " + id);
    }

    private class PrintString {
        private String str;
        public PrintString(String str) {
            this.str = str;
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        SelfManager manager = new SelfManager();
        System.out.println("自我管理线程");
    }
}
