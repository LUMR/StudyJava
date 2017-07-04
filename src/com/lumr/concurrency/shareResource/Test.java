package com.lumr.concurrency.shareResource;

/**
 * 测试模块
 * Created by lumr on 2017/5/24.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("加锁的：");
//        EvenChecker.test(new SynchronizedEventGenerator(), 5);
//        System.out.println("不加锁的：");
//        EvenChecker.test(new EvenGenerator(),10);
        EvenChecker.test(new AtomicEvenGenerator(),10);
    }
}
