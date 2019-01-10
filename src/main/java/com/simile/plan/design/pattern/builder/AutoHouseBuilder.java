package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * Created by yitao on 2019/1/10.
 */
public class AutoHouseBuilder implements HouseBuilder {
    private StoneHouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
    private WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();
    private WoodStoneHouseBuilder woodStoneHouseBuilder = new WoodStoneHouseBuilder();

    public House build(List<Stone> stones, List<Wood> woods) {
        if (stones.size() > 0 && woods.size() > 0) {
            return woodStoneHouseBuilder.build(stones, woods);
        } else if (stones.size() > 0) {
            return stoneHouseBuilder.build(stones, woods);
        } else if (woods.size() > 0) {
            return woodHouseBuilder.build(stones, woods);
        }
        return null;
    }
}
