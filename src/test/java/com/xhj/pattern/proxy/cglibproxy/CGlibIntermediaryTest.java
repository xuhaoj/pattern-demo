package com.xhj.pattern.proxy.cglibproxy;

class CGlibIntermediaryTest {

    public static void main(String[] args) {
        Customer obj = (Customer) new CGlibIntermediary().getInstance(Customer.class);
        obj.zufang();
    }

}