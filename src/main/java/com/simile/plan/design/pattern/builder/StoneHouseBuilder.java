package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * 石头房子构建器
 * Created by yitao on 2019/1/10.
 */
public class StoneHouseBuilder implements HouseBuilder {

    public House build(List<Stone> stones, List<Wood> woods) {
        if (stones.size() > 0) {
            StoneHouse house = new StoneHouse();
            house.addStone(stones);
            return house;
        }
        return null;
    }

}
