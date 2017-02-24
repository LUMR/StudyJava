package com.lumr.test;

import com.lumr.abstractClasses.Car;
import com.lumr.car.Bus;
import com.lumr.car.Carrriage;

import java.util.Scanner;

/**
 * Created by FS on 2017/2/24.
 */
public class CarManagerSystem {
    public static void main(String[] args) {
        CarManagerSystem csm = new CarManagerSystem();
        Car[][] cars = new Car[2][4];
        cars[0][0] = new Carrriage("京NY28588", "宝马", 800, "X6");
        cars[0][1] = new Carrriage("京CNY3284", "宝马", 600, "550i");
        cars[0][2] = new Carrriage("京NY37465", "别克", 300, "林荫大道");
        cars[0][3] = new Carrriage("京NT96968", "别克", 600, "GLB");
        cars[1][2] = new Bus("京6566754", "金杯", 800, "16座");
        cars[1][0] = new Bus("京8696997", "金龙", 800, "16座");
        cars[1][3] = new Bus("京9696996", "金杯", 1500, "34座");
        cars[1][1] = new Bus("京8696998", "金龙", 1500, "34座");
        csm.show(cars);
    }

    public void show(Car[][] cars){
        Scanner input = new Scanner(System.in);
        System.out.println("********欢迎来到LUMR汽车租赁公司*******");
        System.out.println("请选择你要租赁的汽车类型：1.轿车 2.客车");
        int carType = input.nextInt()-1;
        int carBrand = 0;
        int carSize = 0;
        if (carType == 0){
            System.out.println("请选择你要租赁的汽车品牌：1.宝马 2.别克");
            carBrand = input.nextInt()-1;
            if (carBrand == 0)
                System.out.println("请选择你要租赁的车型号：1.宝马X6 2.宝马550i");
            else
                System.out.println("请选择你要租赁的车型号：1.林荫大道 2.GLB");
            carSize = input.nextInt()-1+carBrand;
        }else{
            System.out.println("请选择你要租赁的汽车品牌：1.金龙 2.金杯");
            carBrand = input.nextInt()-1;
            System.out.println("请选择你要租赁的车座数：1.16座 2.34座");
            carSize = input.nextInt()-1+carBrand;
        }
        System.out.println("请输入你要租赁的天数:");
        int day = input.nextInt();
        Car mycar = cars[carType][carBrand+carSize];
        System.out.println("分配给你的车牌号是："+mycar.getPateNum() +
                "\t车型号:" + mycar);
        System.out.println("你需要支付费用：$"+mycar.getDailyRent(day)*day+"（已打折）\t原价：$"+
                mycar.getDailyRent()*day);

    }
}
