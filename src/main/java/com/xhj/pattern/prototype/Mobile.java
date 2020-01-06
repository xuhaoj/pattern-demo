package com.xhj.pattern.prototype;

import java.io.Serializable;


public class Mobile implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}