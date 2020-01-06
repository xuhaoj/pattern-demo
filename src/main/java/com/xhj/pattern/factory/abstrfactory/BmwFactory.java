package com.xhj.pattern.factory.abstrfactory;

import com.xhj.pattern.factory.model.BmwCar;
import com.xhj.pattern.factory.model.BmwTyre;
import com.xhj.pattern.factory.model.ICar;
import com.xhj.pattern.factory.model.ITyre;


public class BmwFactory extends AbstractFactory {
    @Override
    ICar createCar() {
        return new BmwCar();
    }

    @Override
    ITyre createTyre() {
        return new BmwTyre();
    }
}