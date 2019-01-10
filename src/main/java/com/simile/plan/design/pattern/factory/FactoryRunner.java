package com.simile.plan.design.pattern.factory;

/**
 * Created by yitao on 2019/1/10.
 */
public class FactoryRunner {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Car car1 = CarFactory.createCar(Audi.class);
        Car car2 = CarFactory.createCar(Bmw.class);
        Car car3 = CarFactory.createCar(Audi.class.getCanonicalName());
        Car car4 = CarFactory.createCar(Bmw.class.getCanonicalName());

        System.out.println("car1的名称："+car1.getName());
        System.out.println("car2的名称："+car2.getName());
        System.out.println("car3的名称："+car3.getName());
        System.out.println("car4的名称："+car4.getName());
    }
}
