package com.xhj.pattern.factory.methodfactory;

import com.xhj.pattern.factory.model.BmwCar;
import com.xhj.pattern.factory.model.ICar;


public class BmwFactory extends FactoryMethod {
    @Override
    public ICar getCar() {
        return new BmwCar();
    }
}
