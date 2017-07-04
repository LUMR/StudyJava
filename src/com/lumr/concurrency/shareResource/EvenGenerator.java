package com.lumr.concurrency.shareResource;

/**
 * 只产生偶数的迭代器
 * Created by lumr on 2017/5/24.
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    /**
     * 自增方法
     * synchronized:同步，同一对象只允许同时有一个任务访问标了synchronized的方法
     */
    @Override
    public int next() {
        ++currentEvenValue;//Danger point here!
        ++currentEvenValue;
//        currentEvenValue += 2;
        return currentEvenValue;
    }

    @Override
    public int getValue() {
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator(), 5);
    }
}
