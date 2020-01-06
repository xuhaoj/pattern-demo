package com.xhj.pattern.factory.methodfactory;

import com.xhj.pattern.factory.model.ICar;


public class FactoryMethodTest {

    public static void main(String[] args) {
        FactoryMethod bmwFactory = new BmwFactory();
        ICar bmw = bmwFactory.getCar();
        bmw.getBrand();


        FactoryMethod audiFactory = new AudiFactory();
        ICar audi = audiFactory.getCar();
        audi.getBrand();

    }
}
