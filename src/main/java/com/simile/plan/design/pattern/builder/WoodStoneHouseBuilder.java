package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * 木头房子构建器
 * Created by yitao on 2019/1/10.
 */
public class WoodStoneHouseBuilder implements HouseBuilder {

    public House build(List<Stone> stones, List<Wood> woods) {
        if (stones.size() > 0 && woods.size() > 0) {
            WoodStoneHouse house = new WoodStoneHouse();
            house.addStone(stones);
            house.addWood(woods);
            return house;
        }
        return null;
    }

}
