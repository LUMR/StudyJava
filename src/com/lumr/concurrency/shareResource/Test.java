package com.lumr.concurrency.shareResource;

/**
 * 测试模块
 * Created by lumr on 2017/5/24.
 */
public class Test {
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator(), 6);
//        NoEvenChecker.test(new EvenGenerator(),5);
    }
}
