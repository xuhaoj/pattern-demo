package com.xhj.pattern.factory.simplefactory;


import com.xhj.pattern.factory.model.AudiCar;
import com.xhj.pattern.factory.model.BmwCar;
import com.xhj.pattern.factory.model.ICar;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xhj
 * 简单工厂
 */
public class SimpleFactory {


    /**
     * 通过品牌名创建对应的汽车
     *
     * @param brand
     * @return
     */
    public ICar getCardByBrand(String brand) {
        if (StringUtils.equals(brand, "BMW")) {
            return new BmwCar();
        }
        if (StringUtils.equals(brand, "AUDI")) {
            return new AudiCar();
        }
        return null;
    }


    /**
     * 通过Class名创建
     *
     * @param className
     * @return
     */
    public ICar getCardByClassName(String className) {
        if (StringUtils.isNotBlank(className)) {
            try {
                ICar card = (ICar) Class.forName(className).newInstance();
                return card;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 通过Class创建
     *
     * @param clazz
     * @return
     */
    public ICar getCardByClass(Class clazz) {
        if (clazz != null) {
            try {
                ICar card = (ICar) clazz.newInstance();
                return card;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
