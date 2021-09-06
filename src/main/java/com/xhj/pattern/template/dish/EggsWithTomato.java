package com.xhj.pattern.template.dish;

/**
 * 西红柿炒蛋
 */
public class EggsWithTomato extends DodishTemplate {

    @Override
    protected void preparation() {
        System.out.println("买西红柿和鸡蛋");
    }

    @Override
    protected void washVegetables() {
        System.out.println("洗西红柿和鸡蛋");
    }

    @Override
    protected void doing() {
        System.out.println("做西红柿炒蛋");
    }

    @Override
    protected boolean haveTime() {
        return false;
    }

    //重写
    @Override
    protected void eatting() {
        System.out.println("吃的很开心");
    }

}
