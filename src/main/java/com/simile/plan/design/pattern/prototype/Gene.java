package com.simile.plan.design.pattern.prototype;

import java.util.UUID;

/**
 * 基因
 * Created by yitao on 2019/1/10.
 */
public class Gene implements Cloneable {
    private String id;

    public Gene() {
        id = UUID.randomUUID().toString();
    }

    @Override
    protected Gene clone() throws CloneNotSupportedException {
        return (Gene) super.clone();
    }

    @Override
    public String toString() {
        return "Gene{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
