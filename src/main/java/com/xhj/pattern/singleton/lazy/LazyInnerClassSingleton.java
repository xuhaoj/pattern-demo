package com.xhj.pattern.singleton.lazy;


//兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//史上最牛B的单例模式
public class LazyInnerClassSingleton {

    //默认使用LazyInnerClassGeneral的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
/*        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }*/
    }


    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }


    private static class LazyHolder {

        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();

    }

}