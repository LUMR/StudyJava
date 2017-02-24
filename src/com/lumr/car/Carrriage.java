package com.lumr.car;

import com.lumr.abstractClasses.Car;

/**
 * Created by FS on 2017/2/24.
 */
public class Carrriage extends Car {
    private String type;

    public Carrriage(String pateNum, String brand, double dailyRent, String type) {
        super(pateNum, brand, dailyRent);
        this.type = type;
    }

    /**
     *
     * @param day 租赁天数
     * @return
     */
    public double getDailyRent(int day) {
        if (day>150)
            return super.getDailyRent() * 0.7;
        if (day>30)
            return super.getDailyRent()*0.8;
        if (day>7)
            return super.getDailyRent()*0.9;
        return super.getDailyRent();
    }

    @Override
    public String toString() {
        return getBrand()+getType();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
