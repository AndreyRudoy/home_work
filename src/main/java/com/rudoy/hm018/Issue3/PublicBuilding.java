package com.rudoy.hm018.Issue3;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class PublicBuilding implements Building {

    protected int age;
    private String application;

    public PublicBuilding(int age, String application) {

        this.age = age;
        this.application = application;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
