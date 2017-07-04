package com.lumr.concurrency.shareResource;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by lumr on 2017/5/25.
 */
public class AtomicEvenGenerator extends IntGenerator {
    private static AtomicInteger currentEvenValue = new AtomicInteger(0);
    @Override
    public int next() {
        return currentEvenValue.addAndGet(2);
    }

    @Override
    public int getValue() {
        return currentEvenValue.get();
    }
}
