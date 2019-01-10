package com.simile.plan.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yitao on 2019/1/10.
 */
public class BuilderRunner {

    public static void main(String[] args) {
        AutoHouseBuilder autoHouseBuilder = new AutoHouseBuilder();
        List<Stone> stones = new ArrayList<Stone>();
        List<Wood> woods = new ArrayList<Wood>();

        House house1 = autoHouseBuilder.build(stones, woods);
        System.out.println("自动构建house1" + (house1 == null ? "失败" : "成功"));
        System.out.println("-------------");

        stones.add(new Stone());
        woods.add(new Wood());
        House house2 = autoHouseBuilder.build(stones, woods);
        System.out.println("自动构建house2" + (house2 == null ? "失败" : "成功"));
        System.out.println("-------------");

        stones.clear();
        woods.clear();
        stones.add(new Stone());
        House house3 = autoHouseBuilder.build(stones, woods);
        System.out.println("自动构建house3" + (house3 == null ? "失败" : "成功"));
        System.out.println("-------------");

        stones.clear();
        woods.clear();
        woods.add(new Wood());
        House house4 = autoHouseBuilder.build(stones, woods);
        System.out.println("自动构建house4" + (house4 == null ? "失败" : "成功"));
        System.out.println("-------------");

    }

}
