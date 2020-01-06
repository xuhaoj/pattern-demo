package com.xhj.pattern.factory.methodfactory;

import com.xhj.pattern.factory.model.AudiCar;
import com.xhj.pattern.factory.model.ICar;


public class AudiFactory extends FactoryMethod {
    @Override
    public ICar getCar() {
        return new AudiCar();
    }
}
