package com.rudoy.hm018.Issue2;

/**
 * Created by OmEz on 20.05.2017.
 */
public class College implements EducationalInstitution {

    private String name;

    public College(String name) {
        this.name = name;
    }

    public String getTheNameOfTheSchool() {
        return name;
    }

    @Override
    public String getOrganizationType() {
        return "College";
    }
}
