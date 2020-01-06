package com.xhj.pattern.factory.abstrfactory;

import com.xhj.pattern.factory.model.AudiCar;
import com.xhj.pattern.factory.model.AudiTyre;
import com.xhj.pattern.factory.model.ICar;
import com.xhj.pattern.factory.model.ITyre;


public class AudiFactory extends AbstractFactory {
    @Override
    ICar createCar() {
        return new AudiCar();
    }

    @Override
    ITyre createTyre() {
        return new AudiTyre();
    }
}
