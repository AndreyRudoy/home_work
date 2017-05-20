package com.rudoy.hm018.Issue1;

/**
 * Created by OmEz on 20.05.2017.
 */
public class Director implements Employee {

    @Override
    public String getJobTitle() {
        return "Director";
    }

    @Override
    public IPerson getPerson() {
        return null;
    }
}
