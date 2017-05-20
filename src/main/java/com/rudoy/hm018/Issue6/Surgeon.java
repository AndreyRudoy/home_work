package com.rudoy.hm018.Issue6;

/**
 * Created by OmEz on 20.05.2017.
 */
public class Surgeon implements Doctor {

    private String name;
    private int age;

    public Surgeon(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
