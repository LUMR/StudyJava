package com.lumr.test;

import com.lumr.abstractClasses.Car;
import com.lumr.car.Bus;
import com.lumr.car.Carrriage;
import com.lumr.car.Truck;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 出租车管理系统
 * Created by FS on 2017/2/24.
 */
public class CarManagerSystem {
        private Car[][] cars = new Car[3][4];
    public static void main(String[] args) {
        CarManagerSystem csm = new CarManagerSystem();
        String[][] arr = csm.getCarData();
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(csm.getCar("宝马","X6",0));
    }

    public CarManagerSystem() {
        cars[0][0] = new Carrriage("京NY28588", "宝马", 800, "X6");
        cars[0][1] = new Carrriage("京CNY3284", "宝马", 600, "550i");
        cars[0][2] = new Carrriage("京NY37465", "别克", 300, "林荫大道");
        cars[0][3] = new Carrriage("京NT96968", "别克", 600, "GLB");
        cars[1][0] = new Bus("京8696997", "金龙", 800, "16座");
        cars[1][1] = new Bus("京8696998", "金龙", 1500, "34座");
        cars[1][2] = new Bus("京6566754", "金杯", 800, "16座");
        cars[1][3] = new Bus("京9696996", "金杯", 1500, "34座");
        cars[2][0] = new Truck("粤A666666", "东风", 50, 50);
        cars[2][1] = new Truck("粤B123456", "西风", 50,60);
        cars[2][2] = new Truck("粤B123456", "西风", 50,60);
        cars[2][3] = new Truck("粤B123456", "西风", 50,60);

    }

    /**
     * 选择要出租的车
     * @param brand 车品牌
     * @param type  车型号
     * @param carClass  车类型
     * @return
     */
    public Car getCar(String brand, String type, int carClass){
        for (Car theCar :
                cars[carClass]) {
            if (theCar.toString().equals(brand+type))
                return theCar;
        }
        return null;
    }

    /**
     * 获取目前的汽车数据
     * @return 汽车数据数组
     */
    public String[][] getCarData(){
        String[][] carsData = new String[3][4];
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                carsData[i][j] = cars[i][j].toString();
            }
        }
        return carsData;
    }
}
