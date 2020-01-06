package com.xhj.pattern.factory.model;


public class AudiCar implements ICar {
    @Override
    public void getBrand() {
        System.out.println("汽车品牌是:奥迪");
    }
}
