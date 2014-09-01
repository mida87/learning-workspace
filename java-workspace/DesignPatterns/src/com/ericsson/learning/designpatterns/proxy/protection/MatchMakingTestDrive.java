package com.ericsson.learning.designpatterns.proxy.protection;

import java.lang.reflect.Proxy;
import java.util.Hashtable;

/**
 * PROXY: Client and Proxy
 * Proxy is created using built in Java Proxy
 * */
public class MatchMakingTestDrive {
    Hashtable<String, PersonBean> datingDB = new Hashtable<String, PersonBean>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Javabean");
        PersonBean owner = getOwnerProxy(joe);

        System.out.println("Name is: " + owner.getName());
        owner.setInterests("bowling, golf");
        System.out.println("Interests set for owner proxy");

        try {
            owner.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + owner.getHotOrNotRating());

        PersonBean nonOwner = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwner.getName());
        try {
            nonOwner.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwner.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwner.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHanlder(person)
        );
    }

    PersonBean getPersonFromDatabase(String name) {
        return (PersonBean)datingDB.get(name);
    }

    private void initializeDatabase() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        datingDB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
