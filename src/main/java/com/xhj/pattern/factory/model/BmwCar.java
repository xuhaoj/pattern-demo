package com.xhj.pattern.factory.model;




public class BmwCar implements ICar {
    @Override
    public void getBrand() {
        System.out.println("汽车品牌是:宝马");
    }
}