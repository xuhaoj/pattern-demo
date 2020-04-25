package com.xhj.pattern.singleton.register;


/**
 * @author jack xu
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void add() {
        System.out.println("枚举方式");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}