package com.lumr.test;

import com.lumr.job.Employee;
import com.lumr.job.Manager;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 雇员系统测试
 * Created by lumr on 2017/2/22.
 */
public class Test {
    public static void main(String[] args) {
        Integer a1 = 100,a2=100,a3=150,a4=150;
        System.out.println(a1==a2);
        System.out.println(a3.doubleValue()==a4.doubleValue());
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
        System.out.println("返回结果："+finallyTest());
    }
    //提升工资
    public static void tripleSalary(Employee emp, double x){
        emp.raiseSalary(x);
    }

    public void connectMysql(){
        MysqlDataSource conn = new MysqlDataSource();
    }

    public void innerClass(){
    }

    public static int finallyTest(){
        int i = 1;
        try{
            return i;
        }finally {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(++i);
        }
    }


}
