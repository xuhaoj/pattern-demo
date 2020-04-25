package com.xhj.pattern.singleton.test;

import com.xhj.pattern.singleton.register.ContainerSingleton;

/**
 * @author jack xu
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com.xhj.pattern.singleton.test.Pojo");
        Object instance2 = ContainerSingleton.getInstance("com.xhj.pattern.singleton.test.Pojo");
        System.out.println(instance1 == instance2);
    }
}
