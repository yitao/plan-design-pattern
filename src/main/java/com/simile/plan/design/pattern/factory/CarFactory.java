package com.simile.plan.design.pattern.factory;

/**
 * 汽车工厂
 * Created by yitao on 2019/1/10.
 */
public class CarFactory {

    public static Car createCar(Class clazz) {
        if (Audi.class.equals(clazz)) {
            return new Audi();
        } else if (Bmw.class.equals(clazz)) {
            return new Bmw();
        }
        return null;
    }

    public static Car createCar(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(className);
        return (Car) clazz.newInstance();
    }

}
