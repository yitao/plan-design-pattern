package com.simile.plan.design.pattern.strategy;

/**
 * Created by yitao on 2020/12/17.
 */
public class Main {

    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException {
        Type type = new Type1();
        Strategy s = new Strategy();
        s.initService(Type1.class,Service1.class);
        s.process(type);
    }
}
