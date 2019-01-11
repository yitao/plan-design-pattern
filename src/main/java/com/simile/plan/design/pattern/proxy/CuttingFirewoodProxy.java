package com.simile.plan.design.pattern.proxy;

/**
 * 砍柴代理机构
 * Created by yitao on 2019/1/11.
 */
public class CuttingFirewoodProxy implements CuttingFirewood {
    private CuttingFirewood cuttingFirewood;

    public CuttingFirewoodProxy(CuttingFirewood cuttingFirewood) {
        this.cuttingFirewood = cuttingFirewood;
    }

    public void cuttingFirewood() {
        if (cuttingFirewood != null) {
            beforeCuttingFirewood();
            cuttingFirewood.cuttingFirewood();
            afterCuttingFirewood();
        }
    }

    private void beforeCuttingFirewood() {
        System.out.println("砍柴前准备下斧子");
    }

    private void afterCuttingFirewood() {
        System.out.println("砍柴后收取一点中介费");
    }
}
