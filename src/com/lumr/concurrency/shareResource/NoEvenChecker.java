package com.lumr.concurrency.shareResource;

import com.lumr.concurrency.DaemonThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 奇数检测
 * Created by lumr on 2017/5/24.
 */
public class NoEvenChecker extends EvenChecker {
    public NoEvenChecker(IntGenerator generator, int id) {
        super(generator, id);
    }

    @Override
    public void run() {
        IntGenerator generator = getGenerator();
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 == 0) {
                System.out.println("线程：" + Thread.currentThread() + "\t值:" + val + " 不是奇数!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("按C退出。");
        ExecutorService service = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < count; i++) {
            service.execute(new NoEvenChecker(gp, i));
        }
        service.shutdown();
    }
}
