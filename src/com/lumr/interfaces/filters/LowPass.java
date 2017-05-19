package com.lumr.interfaces.filters;

/**
 * Created by lumr on 2017/5/19.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

}
