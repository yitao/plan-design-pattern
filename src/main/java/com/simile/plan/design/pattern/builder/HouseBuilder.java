package com.simile.plan.design.pattern.builder;

import java.util.List;

/**
 * 房屋构建器
 * Created by yitao on 2019/1/10.
 */
public interface HouseBuilder {

    House build(List<Stone> stones, List<Wood> woods);

}
