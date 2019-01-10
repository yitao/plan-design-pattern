package com.simile.plan.design.pattern.prototype;

/**
 * 克隆人
 * Created by yitao on 2019/1/10.
 */
public class CloneMan implements Cloneable {
    private Gene gene;

    public CloneMan() {
        gene = new Gene();
    }

    @Override
    protected CloneMan clone() throws CloneNotSupportedException {
        CloneMan cloneMan = (CloneMan) super.clone();
        Gene ngene = this.gene.clone();
        cloneMan.setGene(ngene);
        return cloneMan;
    }

    @Override
    public String toString() {
        return gene.toString();
    }

    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }
}
