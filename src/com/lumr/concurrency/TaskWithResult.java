package com.lumr.concurrency;

import java.util.concurrent.Callable;

/**
 * Created by lumr on 2017/5/22.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult "+ id;
    }
}
