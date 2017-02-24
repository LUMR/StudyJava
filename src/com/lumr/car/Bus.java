package com.lumr.car;

import com.lumr.abstractClasses.Car;

/**
 * Created by FS on 2017/2/24.
 */
public class Bus extends Car {
    private String seatingSize;

    public Bus(String pateNum, String brand, double dailyRent, String seatingSize) {
        super(pateNum, brand, dailyRent);
        this.seatingSize = seatingSize;
    }

    /**
     *
     * @param day 租赁天数
     * @return
     */
    public double getDailyRent(int day) {
        if (day > 150)
            return super.getDailyRent()*0.6;
        if (day > 30)
            return super.getDailyRent()*0.7;
        if (day > 7)
            return super.getDailyRent()*0.8;
        if (day > 3)
            return super.getDailyRent()*0.9;
        return super.getDailyRent();
    }

    @Override
    public String toString() {
        return getBrand()+getSeatingSize();
    }

    public String getSeatingSize() {
        return seatingSize;
    }

    public void setSeatingSize(String seatingSize) {
        this.seatingSize = seatingSize;
    }
}
