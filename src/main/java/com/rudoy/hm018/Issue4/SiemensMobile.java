package com.rudoy.hm018.Issue4;

/**
 * Created by OmEz on 20.05.2017.
 */
public abstract class SiemensMobile implements Mobile {

    private String model;

    @Override
    public String getModel(){return model;}
    @Override
    public String getFabricant(){return "Siemens";
    }

    public SiemensMobile(String model) {
        this.model = model;
    }
}
