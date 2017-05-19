package com.lumr.interfaces;

/**
 * Created by lumr on 2017/5/19.
 */
public class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}
