package com.lumr.concurrency;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 并发倒计时
 * Created by lumr on 2017/5/22.
 */
public class BasicThreads {
    public static int im;
    public static void main(String[] args){
        test1();
        test2();
        ReadWriteLock lock = new ReentrantReadWriteLock();
        lock.writeLock().lock();
    }

    public static void test1(){
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for liftoff.");
    }

    public static void test2(){
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new LiftOff());
            thread.start();
        }
    }
}
