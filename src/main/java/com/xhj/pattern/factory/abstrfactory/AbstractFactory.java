package com.xhj.pattern.factory.abstrfactory;

import com.xhj.pattern.factory.model.ICar;
import com.xhj.pattern.factory.model.ITyre;


abstract class AbstractFactory {

    abstract ICar createCar();

    abstract ITyre createTyre();

}
