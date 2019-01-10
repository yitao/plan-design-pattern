package com.simile.plan.design.pattern.prototype;

import java.util.UUID;

/**
 * Created by yitao on 2019/1/10.
 */
public class PrototypeRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        long st = System.nanoTime();
        CloneMan cloneMan = new CloneMan();
        long et1 = System.nanoTime();
        CloneMan cloneMan1 = new CloneMan();
        long et2 = System.nanoTime();
        CloneMan cloneMan2 = cloneMan.clone();
        long et3 = System.nanoTime();

        System.out.println(cloneMan + "创建时间：" + (et1 - st));
        System.out.println(cloneMan1 + "创建时间：" + (et2 - et1));
        System.out.println(cloneMan2 + "创建时间：" + (et3 - et2));

        cloneMan2.getGene().setId(UUID.randomUUID().toString());
        System.out.println("cloneMan2修改基因后cloneMan2：" + cloneMan2);
        System.out.println("cloneMan2修改基因后cloneMan：" + cloneMan);
    }

}
