package com.lumr.interfaces.filters;

/**
 * Created by lumr on 2017/5/19.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }

}
