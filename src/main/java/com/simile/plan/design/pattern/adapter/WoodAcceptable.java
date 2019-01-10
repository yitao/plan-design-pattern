package com.simile.plan.design.pattern.adapter;

import com.simile.plan.design.pattern.builder.Wood;

/**
 * 木头制作物
 * Created by yitao on 2019/1/10.
 */
public interface WoodAcceptable {

    /**
     * 使用一个木头去制作木门
     *
     * @param wood 木头
     * @return
     */
    WoodDoor makeWoodDoor(Wood wood);


    /**
     * 使用一个木头去制作木碗
     *
     * @param wood 木头
     * @return
     */
    WoodBowl makeWoodBowl(Wood wood);

}
