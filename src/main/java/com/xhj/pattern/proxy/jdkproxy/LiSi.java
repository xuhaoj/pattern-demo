package com.xhj.pattern.proxy.jdkproxy;

import com.xhj.pattern.proxy.staticproxy.IPerson;

/**
 * @author jackxu
 */
public class LiSi implements IPerson {

    @Override
    public void findHouse() {
        System.out.println("李四要求：便宜");
    }

}