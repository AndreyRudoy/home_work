package com.rudoy.hm018.Issue4;

/**
 * Created by OmEz on 20.05.2017.
 */
public class Model extends SiemensMobile {

    public Model(int year, String fabricator) {
        super(year, fabricator);
    }

    @Override
    public int getYear() {
        return 1995;
    }
}
