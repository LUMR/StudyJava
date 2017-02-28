package com.lumr.throwableClass;

import java.util.Scanner;

/**
 * 分析堆栈轨迹元素
 * Created by lumr on 2017/2/28.
 */
public class StackTraceTest {
    /**
     * 输出n的阶乘
     * @param n 阶乘n
     * @return 阶乘n的值
     */
    private static int factorial(int n){
        System.out.println("factorial(" + n + "):");

        //输出堆栈轨迹
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f :
                frames) {
            System.out.println(f);
        }

        int r;
        if (n <= 1)
            r = 1;
        else
            r = n * factorial(n-1);
        System.out.println("return: " + r);
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = in.nextInt();
        factorial(n);
    }
}
