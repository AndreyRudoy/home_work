package com.rudoy.hm016;

/**
 * Created by OmEz on 01.05.2017.
 */
public class Equipment extends Sizeable {

    private String name;
    private String manufacturer;
    private String model;
    private String type;

    public Equipment(int height, int width, int weight, String name, String manufacturer, String model, String type) {
        super(height, width, weight);
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
    }

    public Equipment(int height, int width, int weight, String type) {
        super(height, width, weight);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
