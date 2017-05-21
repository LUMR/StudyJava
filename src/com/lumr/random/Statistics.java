package com.lumr.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 统计随机数的分布情况
 * Created by lumr on 2017/5/20.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(89);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<10000;i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
