package com.rudoy.hm018.Issue4;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class SiemensMobile implements Mobile {

    protected int year;
    private String fabricator;

    public SiemensMobile(int year, String fabricator) {

        this.year = year;
        this.fabricator = fabricator;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setYear(int year) { this.year = year;}

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }
}
