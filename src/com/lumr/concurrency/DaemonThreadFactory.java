package com.lumr.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * 后台线程工厂
 * Created by lumr on 2017/5/24.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        if (!thread.isDaemon())
            thread.setDaemon(true);
        if (thread.getPriority()!=5)
            thread.setPriority(5);
        return thread;
    }
}
