package com.xhj.pattern.proxy.staticproxy;

/**
 * @author jackxu
 */
public class HouseProxy implements IPerson {

    private ZhangSan zhangsan;

    public HouseProxy(ZhangSan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findHouse() {
        System.out.println("中介开始帮你找房");
        zhangsan.findHouse();
        System.out.println("成功找到啦");
    }

}