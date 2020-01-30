package com.xhj.pattern.proxy.staticproxy;


import com.xhj.pattern.proxy.Son;

public class ProxyTest {

    public static void main(String[] args) {

        Mother mother = new Mother(new Son());
        mother.findLove();


    }

}