package com.xhj.pattern.decorator;

/**
 * @author jackxu
 */
public class BasePancake extends Pancake {

    @Override
    protected String getMsg() {
        return "标配手抓饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }

}