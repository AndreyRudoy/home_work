package com.rudoy.hm018.Issue6;

public class Neurosurgeon implements Doctor {
    private String name;
    private int age;

    public Neurosurgeon(String name, int age) {
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
