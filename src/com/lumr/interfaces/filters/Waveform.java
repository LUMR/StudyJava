package com.lumr.interfaces.filters;

/**
 * Created by lumr on 2017/5/19.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "waveform "+ id;
    }
}
