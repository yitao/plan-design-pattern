package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * Created by yitao on 2019/1/10.
 */
public abstract class AbstractHouse implements House {

    public AbstractHouse() {
        System.out.println(getName() + "建好了");
    }

    public void addStone(List<Stone> stones) {
        System.out.println(getName() + "使用了" + stones.size() + "块石头");
    }

    public void addWood(List<Wood> woods) {
        System.out.println(getName() + "使用了" + woods.size() + "块木头");
    }
}
