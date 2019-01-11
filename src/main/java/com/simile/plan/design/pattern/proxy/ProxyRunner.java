package com.simile.plan.design.pattern.proxy;

/**
 * Created by yitao on 2019/1/11.
 */
public class ProxyRunner {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(Woodman.class.getName());
        Woodman woodman = (Woodman) clazz.newInstance();
        CuttingFirewoodProxy cuttingFirewoodProxy = new CuttingFirewoodProxy(woodman);
        cuttingFirewoodProxy.cuttingFirewood();
    }

}
