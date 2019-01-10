package com.simile.plan.design.pattern.adapter;

/**
 * 木碗
 * Created by yitao on 2019/1/10.
 */
public class WoodBowl {
    private int woodBrickSize;  //木块数量

    public WoodBowl(int woodBrickSize) {
        this.woodBrickSize = woodBrickSize;
    }

    public int getWoodBrickSize() {
        return woodBrickSize;
    }

    public void setWoodBrickSize(int woodBrickSize) {
        this.woodBrickSize = woodBrickSize;
    }
}
