package com.lumr.job;

/**
 * Created by lumr on 2017/2/22.
 * @author lumr
 */
public class Manager extends Employee{
    private double bouns;

    public Manager() {
        super();
        this.bouns = 4000;
    }

    public Manager(String name, double salary, int year, int month, int day, double bouns) {
        super(name, salary, year, month, day);
        this.bouns = bouns;
    }

    @Override
    public String toString() {
        return "Manager{" +"name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", hireDay=" + getHireDay() +
                ", bouns=" + bouns +
                '}';
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

}
