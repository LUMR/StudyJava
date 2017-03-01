package com.lumr.test;

import com.lumr.job.Employee;

import java.util.Arrays;

/**
 * 基于Employee类的接口运用测试
 * Created by fsweb on 17-3-1.
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker",35000);
        staff[1] = new Employee("Carl Cracker",75000);
        staff[2] = new Employee("Tony Tester",38000);

        Arrays.sort(staff);

        for (Employee e :
                staff) {
            System.out.println("name:" + e.getName() + ",salary=" + e.getSalary());
        }
    }


}
