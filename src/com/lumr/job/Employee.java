package com.lumr.job;

import java.time.LocalDate;
import java.util.Objects;

import com.lumr.abstractClasses.Person;

/**
 * 雇员的类
 * Created by lumr on 2017/2/22.
 * @author lumr
 */
public class Employee extends Person{
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

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
     * 判断对象相等
     * @param otherObject
     * @return
     */
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    /**
     * 示范代码
     * @return
     */
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Employee employee = (Employee) o;
//
//        if (Double.compare(employee.salary, salary) != 0) return false;
//        if (!name.equals(employee.name)) return false;
//        return hireDay.equals(employee.hireDay);
//    }

    /**
     * 示范代码
     * @return
     */
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + hireDay.hashCode();
        return result;
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

    @Override
    public String getDescription() {
        return String.format("an employee with a salay of $%.2f", getSalary());
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
