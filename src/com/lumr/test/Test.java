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
        Random random = new Random(86);
        System.out.println(System.nanoTime());
    }
    //提升工资
    public static void tripleSalary(Employee emp, double x){
        emp.raiseSalary(x);
    }

    public void connectMysql(){
        MysqlDataSource conn = new MysqlDataSource();
    }

}
