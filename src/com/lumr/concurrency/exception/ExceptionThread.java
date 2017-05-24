package com.lumr.concurrency.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lumr on 2017/5/24.
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException("线程抛出的异常！");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new ExceptionThread());
        service.shutdown();
    }
}
