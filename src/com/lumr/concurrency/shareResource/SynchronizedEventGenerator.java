package com.lumr.concurrency.shareResource;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lumr on 2017/5/25.
 */
public class SynchronizedEventGenerator extends EvenGenerator {
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            return super.next();
        }finally {
            lock.unlock();
        }
    }
}
