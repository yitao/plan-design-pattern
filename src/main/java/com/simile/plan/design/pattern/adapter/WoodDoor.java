package com.simile.plan.design.pattern.adapter;

/**
 * 木门
 * Created by yitao on 2019/1/10.
 */
public class WoodDoor {

    private int woodBrickSize;  //木块数量

    public WoodDoor(int woodBrickSize) {
        this.woodBrickSize = woodBrickSize;
    }

    public int getWoodBrickSize() {
        return woodBrickSize;
    }

    public void setWoodBrickSize(int woodBrickSize) {
        this.woodBrickSize = woodBrickSize;
    }
}
