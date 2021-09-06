package com.xhj.pattern.template.dish;

public class Test {
    public static void main(String[] args) {
        System.out.println("=========做西红柿鸡蛋流程=========");
        EggsWithTomato eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();

        System.out.println("=========做红烧肉流程=========");
        RedBraisedMeat redBraisedMeat = new RedBraisedMeat();
        redBraisedMeat.dodish();
    }
}
