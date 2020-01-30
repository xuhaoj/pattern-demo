package com.xhj.pattern.proxy.staticproxy;

import com.xhj.pattern.proxy.Person;


public class Mother implements Person {
    private Person person;

    public Mother(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("母亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");
    }

    public void findJob() {

    }


}