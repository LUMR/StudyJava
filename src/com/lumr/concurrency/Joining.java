package com.lumr.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * 线程插入
 * Created by lumr on 2017/5/24.
 */
public class Joining extends Thread{
    private Sleeper sleeper;

    public Joining(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try{
            System.out.println(currentThread().getName()+"开始插入");
            sleeper.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println(getName()+" join completed.");
    }

    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("Sleep", 2000),
                grumpy = new Sleeper("Grumpy", 2000);
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始插入线程:");
        Joining doper = new Joining("Doper", sleeper),
                doc = new Joining("Doc", grumpy);
        grumpy.interrupt();
    }
}
