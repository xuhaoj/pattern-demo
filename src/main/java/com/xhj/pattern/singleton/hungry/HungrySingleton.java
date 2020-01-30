package com.xhj.pattern.singleton.hungry;


//优点：没有加任何的锁、执行效率比较高，绝对线程安全
//缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间

public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }


}