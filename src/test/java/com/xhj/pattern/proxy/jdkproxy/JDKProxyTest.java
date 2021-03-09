package com.xhj.pattern.proxy.jdkproxy;

import com.xhj.pattern.proxy.staticproxy.IPerson;
import com.xhj.pattern.proxy.staticproxy.ZhangSan;

class JDKProxyTest {

    public static void main(String[] args) {
        JDKIntermediary intermediary = new JDKIntermediary();
        IPerson zhangsan = intermediary.getInstance(new ZhangSan());
        zhangsan.findHouse();

        IPerson lisi = intermediary.getInstance(new LiSi());
        lisi.findHouse();
    }

}