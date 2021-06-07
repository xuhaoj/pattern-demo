package com.xhj.pattern.prototype.shallow;


import lombok.Data;
import java.util.List;


@Data
public class ShallowConcretePrototype implements Cloneable {

    private int age;

    private String name;

    private List<String> hobbies;

    @Override
    public ShallowConcretePrototype clone() {
        try {
            return (ShallowConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}