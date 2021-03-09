package com.xhj.pattern.proxy.staticproxy;

public class HouseProxyTest {

    public static void main(String[] args) {
        HouseProxy proxy = new HouseProxy(new ZhangSan());
        proxy.findHouse();
    }

}