package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * 木头房子构建器
 * Created by yitao on 2019/1/10.
 */
public class WoodHouseBuilder implements HouseBuilder {

    public House build(List<Stone> stones, List<Wood> woods) {
        if (woods.size() > 0) {
            WoodHouse house = new WoodHouse();
            house.addWood(woods);
            return house;
        }
        return null;
    }

}
