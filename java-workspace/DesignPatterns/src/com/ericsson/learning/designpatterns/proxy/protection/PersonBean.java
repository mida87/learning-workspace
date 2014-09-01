package com.ericsson.learning.designpatterns.proxy.protection;

/**
 * PROXY: Subject <interface>
 * */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();


    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
