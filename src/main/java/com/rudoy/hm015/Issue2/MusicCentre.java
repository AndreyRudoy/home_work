package com.rudoy.hm015.Issue2;

/**
 * Created by OmEz on 23.04.2017.
 */
public class MusicCentre extends Recorder {
    String name;
    String firm;

    public void setConfiguration(boolean tape, boolean disk, boolean radio) {
        super.setConfiguration(tape, disk, radio);
    }

    public void setModel(String name, String firm) {
        this.name = name;
        this.firm = firm;
    }

    public String toString() {
        return "Music centre: tape = " + hasTape() + ", disk = " + hasDisk()
                + ", radio = " + hasRadio() + ", name = " + name + ", firm = " + firm;
    }
}
