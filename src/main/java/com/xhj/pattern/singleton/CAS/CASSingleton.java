package com.xhj.pattern.singleton.CAS;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author jack xu
 */
public class CASSingleton {
    private static final AtomicReference<CASSingleton> INSTANCE = new AtomicReference<CASSingleton>();

    private CASSingleton() {
    }

    public static CASSingleton getInstance() {
        for (; ; ) {
            CASSingleton singleton = INSTANCE.get();
            if (null != singleton) {
                return singleton;
            }

            singleton = new CASSingleton();
            if (INSTANCE.compareAndSet(null, singleton)) {
                return singleton;
            }
        }
    }
}
