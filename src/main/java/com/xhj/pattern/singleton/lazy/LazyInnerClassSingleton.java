package com.xhj.pattern.singleton.lazy;


import java.io.Serializable;

/**
 * @author jack xu
 * 兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 */
public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton() {
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("不要试图用反射破坏单例模式");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }


    private static class LazyHolder {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    private Object readResolve() {
        return LazyHolder.INSTANCE;
    }

}