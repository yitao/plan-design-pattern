package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * 房屋
 * Created by yitao on 2019/1/10.
 */
public interface House {

    String getName();

    void addStone(List<Stone> stones);

    void addWood(List<Wood> woods);

}
