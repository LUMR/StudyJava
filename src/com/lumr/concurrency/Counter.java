package com.lumr.concurrency;

/**
 * 多线程变量读取自增
 * Created by lumr on 2017/5/24.
 */
public class Counter {
    private volatile static int number=1;
    public static void inc(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number++;
    }
    public static void main(String[] args){
        for (int i = 0;i<200;i++){
            new Thread(
                    () -> Counter.inc()
            ).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);
    }
}
