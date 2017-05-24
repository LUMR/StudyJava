package com.lumr.concurrency;

/**
 * Created by lumr on 2017/5/24.
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        this.duration = sleepTime;
        start();//线程自启动
    }

    @Override
    public void run() {
        try{
            System.out.println(getName()+"\t所在线程:"+currentThread());
            sleep(duration);
        }catch (InterruptedException e){
            System.out.println(getName()+" was interrupted(打断)."+" isInterrupted():"+isInterrupted()+"\t所在线程:"+currentThread());
            return;
        }
        System.out.println(getName() + " has awakened\t所在线程:"+currentThread());
    }
}
