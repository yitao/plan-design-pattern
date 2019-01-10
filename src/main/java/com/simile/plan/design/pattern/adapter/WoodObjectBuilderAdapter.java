package com.simile.plan.design.pattern.adapter;

import com.simile.plan.design.pattern.builder.Wood;

import java.util.ArrayList;
import java.util.List;

/**
 * 木门建造者适配器
 * Created by yitao on 2019/1/10.
 */
public class WoodObjectBuilderAdapter extends WoodObjectBuilder implements WoodAcceptable {

    public List<WoodBrick> makeWoodBrick(Wood wood) {
        List<WoodBrick> woodBricks = new ArrayList<WoodBrick>();
        if (wood != null) {
            for (int i = 0; i < wood.getSize(); i++) {
                WoodBrick woodBrick = new WoodBrick();
                woodBricks.add(woodBrick);
            }
        }
        return woodBricks;
    }

    /**
     * 使用一个木头去制作木门
     *
     * @param wood 木头
     * @return
     */
    public WoodDoor makeWoodDoor(Wood wood) {
        return super.buildDoor(makeWoodBrick(wood));
    }

    /**
     * 使用一个木头去制作木碗
     *
     * @param wood 木头
     * @return
     */
    public WoodBowl makeWoodBowl(Wood wood) {
        return super.buildBowl(makeWoodBrick(wood));
    }
}
