package com.lumr.concurrency.shareResource;

import com.lumr.concurrency.DaemonThreadFactory;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 偶数检测
 * Created by lumr on 2017/5/24.
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private static Scanner input = new Scanner(System.in);
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        int val = 0;
        while (!generator.isCanceled()) {
            val = generator.next();
            if (val % 2 != 0) {
                System.out.println("线程：" + Thread.currentThread() + "\t值:" + val + " 不是偶数!");
                generator.cancel();
            }
        }
        System.out.println("线程：" + Thread.currentThread() + "停止，\t值:" + val);
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("按C退出。");
        ExecutorService service = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < count; i++) {
            service.execute(new EvenChecker(gp, i));
        }
        service.shutdown();
        input.next();
        System.out.println("最终值：" + gp.getValue());
    }

    public IntGenerator getGenerator() {
        return generator;
    }
}
