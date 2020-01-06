package com.xhj.pattern.factory.simplefactory;


import com.xhj.pattern.factory.model.AudiCar;
import com.xhj.pattern.factory.model.BmwCar;
import com.xhj.pattern.factory.model.ICar;


/**
 * @author xhj
 * 简单工厂测试类
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        ICar bmw = simpleFactory.getCardByBrand("BMW");
        bmw.getBrand();
        ICar audi = simpleFactory.getCardByBrand("AUDI");
        audi.getBrand();



/*
        ICar bmw2 = simpleFactory.getCardByClassName(BmwCar.class.getName());
        bmw2.getBrand();
        ICar audi2 = simpleFactory.getCardByClassName(AudiCar.class.getName());
        audi2.getBrand();



        ICar bmw3 = simpleFactory.getCardByClass(BmwCar.class);
        bmw3.getBrand();
        ICar audi3 = simpleFactory.getCardByClass(AudiCar.class);
        audi3.getBrand();
*/

    }
}
