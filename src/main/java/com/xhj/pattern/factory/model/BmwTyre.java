package com.xhj.pattern.factory.model;


public class BmwTyre implements ITyre {
    @Override
    public void getBrand() {
        System.out.println("轮胎品牌是:宝马");
    }
}
