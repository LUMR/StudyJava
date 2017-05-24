package com.lumr.concurrency.responsive;

/**
 * 无限循环的线程
 * Created by lumr on 2017/5/24.
 */
public class UnresponsiveUI {
    private volatile double d = 1;

    public UnresponsiveUI() throws Exception {
        while (d>0){
            d = d+(Math.PI + Math.E)/d;
            System.in.read();
        }
    }
}
