package com.lumr.interfaces.filters;

/**
 * Created by lumr on 2017/5/19.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
}
