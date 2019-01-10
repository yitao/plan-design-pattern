package com.simile.plan.design.pattern.singleton;

/**
 * Created by yitao on 2019/1/10.
 */
public class WorldRunner {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            World.getInstance().run();
            Thread.sleep(1000L);
        }
    }

}
