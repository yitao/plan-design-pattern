package com.simile.plan.design.pattern.adapter;

import com.simile.plan.design.pattern.builder.Wood;

/**
 * Created by yitao on 2019/1/10.
 */
public class AdapterRunner {

    public static void main(String[] args) {
        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        System.out.println("我们只有两个木头，一个想用来做门，一个想用来做碗");
        WoodObjectBuilderAdapter adapter = new WoodObjectBuilderAdapter();

        WoodDoor woodDoor = adapter.makeWoodDoor(wood1);
        System.out.println("我们用木头创建了一个木门：" + woodDoor);
        WoodBowl woodBowl = adapter.makeWoodBowl(wood2);
        System.out.println("我们用木头创建了一个木碗：" + woodBowl);
    }


}
