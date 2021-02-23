package com.xhj.pattern.decorator;


/**
 * @author xhj
 * @date 2021/2/23 16:45
 */
public class Test {

    public static void main(String[] args) {
        //标配
        Pancake pancake = new BasePancake();
        System.out.println(pancake.getMsg() + ",总价" + pancake.getPrice() + "元");
        //加了鸡蛋的手抓饼
        pancake = new EggDecorator(pancake);
        System.out.println(pancake.getMsg() + ",总价" + pancake.getPrice() + "元");
        //加了生菜的手抓饼
        pancake = new LettuceDecorator(pancake);
        System.out.println(pancake.getMsg() + ",总价" + pancake.getPrice() + "元");
    }

}