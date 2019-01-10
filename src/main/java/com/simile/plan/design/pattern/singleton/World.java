package com.simile.plan.design.pattern.singleton;

import java.util.UUID;

/**
 * 假如世界只有一个，也是他创造了自己
 * Created by yitao on 2019/1/10.
 */
public class World {
    private String id;
    private long liveTs;    //存活时间

    private World() {
        this.id = UUID.randomUUID().toString();
    }

    private final static World world = new World();

    public static World getInstance() {
        return world;
    }

    public void run() {
        this.liveTs++;
        System.out.println("编号" + this.id + "的世界运行时间：" + this.liveTs);
    }

}
