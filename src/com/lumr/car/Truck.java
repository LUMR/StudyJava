package com.lumr.car;

import com.lumr.abstractClasses.Car;

/**
 * Created by fsweb on 17-2-27.
 */
public class Truck extends Car {
    private int tonnage;

    public Truck(String pateNum, String brand, double dailyRent, int tonnage) {
        super(pateNum, brand, dailyRent);
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return getBrand()+getTonnage();
    }

    @Override
    public double getDailyRent(int day) {
        return tonnage*50;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
}
