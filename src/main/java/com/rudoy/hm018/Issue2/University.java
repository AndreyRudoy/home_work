package com.rudoy.hm018.Issue2;

/**
 * Created by OmEz on 20.05.2017.
 */
public class University implements EducationalInstitution {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public String getTheNameOfTheSchool() {
        return name;
    }

    @Override
    public String getOrganizationType() {
        return "University";
    }

}
