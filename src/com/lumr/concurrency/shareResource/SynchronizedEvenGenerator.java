package com.lumr.concurrency.shareResource;

/**
 * Created by lumr on 2017/5/25.
 */
public class SynchronizedEvenGenerator extends EvenGenerator {
    @Override
    public synchronized int next() {
        return super.next();
    }
}
