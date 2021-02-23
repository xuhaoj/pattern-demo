package com.xhj.pattern.decorator;

/**
 * @author jackxu
 */
public class PancakeDecorator extends Pancake {


    private Pancake pancake;


    public PancakeDecorator(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    protected String getMsg() {
        return this.pancake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.pancake.getPrice();
    }

}