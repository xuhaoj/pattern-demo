package com.xhj.pattern.factory.abstrfactory;


public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory();
        audiFactory.createCar().getBrand();
        audiFactory.createTyre().getBrand();


        AbstractFactory bmwFactory = new BmwFactory();
        bmwFactory.createCar().getBrand();
        bmwFactory.createTyre().getBrand();
    }
}
