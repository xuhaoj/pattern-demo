package com.xhj.pattern.prototype;


public class DeepCloneTest {

    public static void main(String[] args) {

        Person xushuaige = new Person();
        try {
            Person clone = (Person) xushuaige.clone();
            System.out.println("深克隆：" + (xushuaige.mobile == clone.mobile));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person q = new Person();
        Person n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.mobile == n.mobile));


    }
}
