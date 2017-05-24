package com.lumr.concurrency.shareResource;

/**
 * Created by lumr on 2017/5/24.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public abstract int getValue();
}
