package com.lumr.interfaces;

/**
 * Created by lumr on 2017/5/19.
 */
public class Games {
    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move()) {
        }
    }
}
