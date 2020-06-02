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


    //添加自己需要的操作
    public void singletonOperation() {
        System.out.println("添加自己需要的操作");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}