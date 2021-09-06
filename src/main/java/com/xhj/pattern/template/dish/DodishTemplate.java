package com.xhj.pattern.template.dish;

public abstract class DodishTemplate {

    /**
     * 做饭的过程
     */
    public final void dodish() {
        //1、买菜
        preparation();

        //2、洗菜
        washVegetables();

        //3、做菜
        doing();

        //4、吃饭
        eatting();

        //5、洗碗
        if (haveTime()) {
            washDishes();
        }
    }

    protected abstract void preparation();

    protected abstract void washVegetables();

    protected abstract void doing();

    protected void eatting() {
        System.out.println("吃饭");
    }

    //钩子方法
    protected abstract boolean haveTime();

    protected void washDishes() {
        System.out.println("洗碗");
    }


}