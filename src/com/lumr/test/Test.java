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
        Employee[] managers = new Employee[8];
        Employee[] staff = managers;
        staff[0] = new Employee("dd", 1000, 2010, 2, 20);
        System.out.println(managers[0]);
        System.out.println(staff[0]);
    }
    //提升工资
    public static void tripleSalary(Employee emp, double x){
        emp.raiseSalary(x);
    }

}
