package com.lumr.abstractClasses;

/**
 * 汽车基类
 * @author FS
 * Created by FS on 2017/2/24.
 */
public abstract class Car {
    private String pateNum;
    private String brand;
    private double dailyRent;

    /**
     *
     * @param pateNum 车牌号
     * @param brand 车品牌
     * @param dailyRent 日租金
     */
    public Car(String pateNum, String brand, double dailyRent) {
        this.pateNum = pateNum;
        this.brand = brand;
        this.dailyRent = dailyRent;
    }

    public String getPateNum() {
        return pateNum;
    }

    public void setPateNum(String pateNum) {
        this.pateNum = pateNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDailyRent() {
        return dailyRent;
    }

    public abstract double getDailyRent(int day);

    public void setDailyRent(double rent) {
        this.dailyRent = rent;
    }
}
