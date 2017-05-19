package com.lumr.interfaces;

/**
 * Created by lumr on 2017/5/19.
 */
public class CheckersFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
