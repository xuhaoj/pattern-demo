package com.xhj.pattern.template.dish;

/**
 * 红烧肉
 */
public class RedBraisedMeat extends DodishTemplate {
    @Override
    protected void preparation() {
        System.out.println("买肉");
    }

    @Override
    protected void washVegetables() {
        System.out.println("洗肉");
    }

    @Override
    protected void doing() {
        System.out.println("做红烧肉");
    }

    @Override
    protected boolean haveTime() {
        return true;
    }
}
