package com.lumr.job;

import java.time.LocalDate;

/**
 * 雇员的类
 * Created by lumr on 2017/2/22.
 * @author lumr
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * 默认构造器
     */
    public Employee() {
        this.name = "无名氏";
        this.salary = 6000;
        this.hireDay = LocalDate.now();
    }

    /**
     * constructor
     * @param name 名字
     * @param salary 薪酬
     * @param year 入职年分
     * @param month 入职月份
     * @param day 入职日子
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    /**
     * 输出信息
     */
    public void print(){
        System.out.println("姓名："+getName());
        System.out.println("薪酬："+getSalary());
        System.out.println("入职日期："+getHireDay());
    }

//    set and get
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
}
