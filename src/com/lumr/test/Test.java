package com.lumr.test;

import com.lumr.job.Employee;
import com.lumr.job.Manager;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.util.Random;

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
    }
    //提升工资
    public static void tripleSalary(Employee emp, double x){
        emp.raiseSalary(x);
    }

    public void connectMysql(){
        MysqlDataSource conn = new MysqlDataSource();
    }

}
