package com.xhj.pattern;


import com.xhj.pattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
