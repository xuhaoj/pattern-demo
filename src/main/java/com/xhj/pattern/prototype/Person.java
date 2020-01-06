package com.xhj.pattern.prototype;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * @author xhj
 */
public class Person implements Cloneable, Serializable {

    public int age;

    public String name;

    public Date birthday;

    public Mobile mobile;

    public Person() {
        this.birthday = new Date();
        this.mobile = new Mobile();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }


    public Object deepClone() {
        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Person copy = (Person) ois.readObject();
            copy.birthday = new Date();
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    public Person shallowClone(Person target) {

        Person person = new Person();
        person.age = target.age;
        person.name = target.name;

        person.mobile = target.mobile;
        person.birthday = new Date();
        return person;
    }


}
