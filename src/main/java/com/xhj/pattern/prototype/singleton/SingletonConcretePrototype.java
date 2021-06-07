package com.xhj.pattern.prototype.singleton;


import lombok.Data;

import java.util.List;


@Data
public class SingletonConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> hobbies;


    private static SingletonConcretePrototype instance = new SingletonConcretePrototype();


    private SingletonConcretePrototype() {
    }


    public static SingletonConcretePrototype getInstance() {
        return instance;
    }

    @Override
    public SingletonConcretePrototype clone() {
        return instance;
    }

}