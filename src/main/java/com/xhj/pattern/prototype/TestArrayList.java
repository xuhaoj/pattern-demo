package com.xhj.pattern.prototype;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        ArrayList<String> cloneList = (ArrayList<String>) stringList.clone();
        System.out.println("原型对象：" + stringList);
        System.out.println("克隆对象：" + cloneList);
        System.out.println("——————————————————————分割线————————————————————————");
        cloneList.add("d");
        System.out.println("原型对象：" + stringList);
        System.out.println("克隆对象：" + cloneList);
    }
}