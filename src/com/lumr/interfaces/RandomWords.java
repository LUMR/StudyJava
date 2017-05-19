package com.lumr.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by lumr on 2017/5/19.
 */
public class RandomWords implements Readable {
    private Random rand = new Random(1234567890);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase().toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
        System.out.println((new RandomWords(10)).get());
        RandomWords test = new RandomWords(20);
        int i = 0;
        do {
            System.out.println(test.getRandom(20));
        }while (i++<20);
    }

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
//        System.out.println(count);
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public String get(){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            buffer.append(rand.nextInt(10));
        }
        return buffer.toString();
    }

    public int getRandom(int limit){
        return rand.nextInt(limit);
    }
}
