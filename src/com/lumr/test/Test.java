package com.lumr.test;

import com.lumr.job.Employee;

/**
 * Created by lumr on 2017/2/22.
 */
public class Test {
    public static void main(String[] args) {
        Employee lili = new Employee();
        lili.print();
        tripleSalary(lili, 12);
        lili.print();
    }
    //提升工资
    public static void tripleSalary(Employee emp, double x){
        emp.raiseSalary(x);
    }

    public static void swap(Employee x, Employee y){

    }
}
