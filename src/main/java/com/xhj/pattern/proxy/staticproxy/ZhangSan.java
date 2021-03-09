package com.xhj.pattern.proxy.staticproxy;

/**
 * @author jackxu
 */
public class ZhangSan implements IPerson {

    @Override
    public void findHouse() {
        System.out.println("张三要求：离地铁站近、面积大");
    }

}