package com.simile.plan.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yitao on 2020/12/17.
 */
public class Strategy {

    private Map<Class, Class> processor = new HashMap<Class, Class>();

    public Strategy() {
        processor.put(Type1.class, Service1.class);
        processor.put(Type2.class, Service2.class);
    }

    public void initService(Class clazz, Class service) {
        processor.put(clazz, service);
    }

    public void process(Type type) throws IllegalAccessException, InstantiationException {
        Class clazz = processor.get(type.getClass());
        Object obj = clazz.newInstance();
        Service service = (Service) obj;
        if (service == null) {
            return;
        }
        service.process(type);
    }
}
