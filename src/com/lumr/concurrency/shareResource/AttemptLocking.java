package com.lumr.concurrency.shareResource;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * Created by lumr on 2017/5/25.
 */
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): " + captured);
        }finally {
            if (captured)
                lock.unlock();
        }
    }

    public void timed(){
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
            double d =1;
            for (int i = 0; i < 100; i++) {
                d += (Math.PI+Math.E)/d;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try{
            System.out.println("tryLock(2,TimeUnit.SECONDS):"+captured);
        }finally {
            if (captured)
                lock.unlock();
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        new Thread(){
            {setDaemon(true);
            setPriority(8);}
            public void run(){
                al.lock.lock();
                System.out.println(al.lock.isLocked());
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();
        al.untimed();
        al.timed();
    }
}
