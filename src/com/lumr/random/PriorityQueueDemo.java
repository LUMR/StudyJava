package com.lumr.random;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by lumr on 2017/5/20.
 */
public class PriorityQueueDemo {
    private int test;

    public static void main(String[] args) {
        randomNumbs();
    }

    public static void randomNumbs() {
        Random random = new Random();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < 100; i++) {
            queue.offer(random.nextInt(50));
        }
        System.out.println(queue);
    }

    private class TheInter {
        public void test() {
            System.out.println(PriorityQueueDemo.this.test);
        }
    }
}
