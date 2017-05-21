package com.lumr.random;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by lumr on 2017/5/20.
 */
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.println(queue);
            System.out.print(queue.remove() + " ");
            System.out.println(queue);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random();
        for (int i = 0;i<10;i++) {
            queue.offer(random.nextInt(20));
        }
        System.out.println(queue);
        printQ(queue);
        System.out.println(queue);
    }
}
