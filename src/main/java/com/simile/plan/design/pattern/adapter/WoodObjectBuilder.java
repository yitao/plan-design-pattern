package com.simile.plan.design.pattern.adapter;

import java.util.List;

/**
 * 木质品构建器
 * Created by yitao on 2019/1/10.
 */
public class WoodObjectBuilder {

    /**
     * 利用木块创建木门
     *
     * @param woodBricks 木块
     * @return
     */
    public WoodDoor buildDoor(List<WoodBrick> woodBricks) {
        WoodDoor woodDoor = new WoodDoor(woodBricks.size());
        return woodDoor;
    }

    /**
     * 利用木块创建木碗
     *
     * @param woodBricks 木块
     * @return
     */
    public WoodBowl buildBowl(List<WoodBrick> woodBricks) {
        WoodBowl woodBowl = new WoodBowl(woodBricks.size());
        return woodBowl;
    }


}
