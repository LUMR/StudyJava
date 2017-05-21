package com.lumr.generics;

/**
 * Created by lumr on 2017/5/21.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
