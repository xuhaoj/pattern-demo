package com.xhj.pattern.singleton.lazy;


/**
 * @author jack xu
 * 优点：节省了内存,线程安全
 * 缺点：性能低
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    public synchronized static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }

}