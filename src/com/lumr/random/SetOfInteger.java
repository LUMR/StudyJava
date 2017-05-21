package com.lumr.random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by lumr on 2017/5/20.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(89);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt(100));
        }
        System.out.println(set);
    }
}
