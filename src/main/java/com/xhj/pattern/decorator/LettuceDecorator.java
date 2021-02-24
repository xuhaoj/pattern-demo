package com.xhj.pattern.decorator;

/**
 * @author jackxu
 */
public class LettuceDecorator extends PancakeDecorator {

    public LettuceDecorator(Pancake pancake) {
        super(pancake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1片生菜";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }

}