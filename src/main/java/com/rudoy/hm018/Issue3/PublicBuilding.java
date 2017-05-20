package com.rudoy.hm018.Issue3;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class PublicBuilding implements Building {

    private String address;
    private String application;

    public PublicBuilding(String address, String application) {

        this.address = address;
        this.application = application;
    }

    @Override
    public String getAddress(){
        return address;
    }
    @Override
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }
}
