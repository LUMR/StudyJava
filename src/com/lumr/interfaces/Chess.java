package com.lumr.interfaces;

/**
 * Created by lumr on 2017/5/19.
 */
public class Chess implements Game {
    private int moves =0;
    private static final int MOVES =4;
    @Override
    public boolean move() {
        System.out.println("Chess move "+moves);
        return ++moves != MOVES;
    }
}
