package com.lumr.test;

import com.lumr.abstractClasses.Car;

import java.util.Scanner;

/**
 * Created by fsweb on 17-2-27.
 */
public class CarSystemTest {
    public static void main(String[] args) {
        CarSystemTest test = new CarSystemTest();
        test.view();
    }

    public void view(){
        Scanner input = new Scanner(System.in);
        System.out.println("********欢迎来到LUMR汽车租赁公司*******");
        System.out.println("请选择你要租赁的汽车类型：1.轿车 2.客车 3.卡车");
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
        CarManagerSystem carSys = new CarManagerSystem();
        Car mycar = carSys.getCar("宝马", "X6", carType);
        System.out.println(mycar);
    }


    /**
     * 旧版
     * @param cars
     */
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
