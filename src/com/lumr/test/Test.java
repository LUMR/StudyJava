package com.lumr.test;

import com.lumr.job.Employee;
import com.lumr.job.Manager;

/**
 * Created by lumr on 2017/2/22.
 */
public class Test {
    public static void main(String[] args) {
        Employee lili = new Employee();
        Manager lu = new Manager();
        System.out.println(lu);
        System.out.println(lili);
    }
    //提升工资
    public static void tripleSalary(Employee emp, double x){
        emp.raiseSalary(x);
    }

}
