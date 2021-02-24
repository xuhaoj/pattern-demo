package com.xhj.pattern.decorator;


/**
 * @author xhj
 * @date 2021/2/23 16:45
 */
public class Test {

    public static void main(String[] args) {
        //A同学买了一个标配
        Pancake pancake = new BasePancake();
        System.out.println("A同学买了一个" + pancake.getMsg() + ",总价是" + pancake.getPrice() + "元");

        //B同学买了加鸡蛋的手抓饼
        Pancake pancakeWithEgg = new EggDecorator(pancake);
        System.out.println("B同学买了一个" + pancakeWithEgg.getMsg() + ",总价是" + pancakeWithEgg.getPrice() + "元");

        //C同学买了加生菜的手抓饼
        Pancake pancakeWithLettuce = new LettuceDecorator(pancake);
        System.out.println("C同学买了一个" + pancakeWithLettuce.getMsg() + ",总价是" + pancakeWithLettuce.getPrice() + "元");

        //D同学买了加鸡蛋加生菜的手抓饼
        Pancake pancakeWithEggAndLettuce = new LettuceDecorator(pancakeWithEgg);
        System.out.println("D同学买了一个" + pancakeWithEggAndLettuce.getMsg() + ",总价是" + pancakeWithEggAndLettuce.getPrice() + "元");
    }

}