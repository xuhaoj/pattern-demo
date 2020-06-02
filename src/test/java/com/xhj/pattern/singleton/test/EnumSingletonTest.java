package com.xhj.pattern.singleton.test;

import com.xhj.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) throws Exception {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println("正常情况下，实例化两个实例是否相同：" + (singleton1 == singleton2));
        System.out.println("----------------------------------------------------------------");


        Constructor<EnumSingleton> constructor = null;
        constructor = EnumSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton singleton3 = constructor.newInstance();
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同，这里会报错" + (singleton1 == singleton3));
        System.out.println("----------------------------------------------------------------");


        singleton1.setData("我是jack xu");
        singleton1.singletonOperation();
        String name = (String) singleton1.getData();
        System.out.println("枚举单例像普通对象一样操作使用即可");
        System.out.println("----------------------------------------------------------------");

    }

}