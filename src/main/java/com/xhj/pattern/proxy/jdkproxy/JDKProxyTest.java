package com.xhj.pattern.proxy.jdkproxy;

import com.xhj.pattern.proxy.Person;
import com.xhj.pattern.proxy.Son;


public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Person obj = (Person) new JDKMeipo().getInstance(new Son());
            obj.findLove();
            System.out.println(obj);
            /*Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);*/


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
