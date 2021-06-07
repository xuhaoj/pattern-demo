package com.xhj.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;


public class Client {


    public static void main(String[] args) {
        //创建原型对象
        ShallowConcretePrototype prototype = new ShallowConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Jack");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("看书");
        hobbies.add("旅游");
        prototype.setHobbies(hobbies);

        //拷贝原型对象
        ShallowConcretePrototype cloneType = prototype.clone();
        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneType);

        System.out.println("——————————————————————分割线————————————————————————");
        cloneType.getHobbies().add("技术控");
        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneType);
        System.out.println(prototype.getHobbies() == cloneType.getHobbies());
    }

}
