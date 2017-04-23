package com.rudoy.hm015.Issue2;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Recorder {
    boolean tape;
    boolean disk;
    boolean radio;

    private String exist(boolean condition) {
        if (condition) return "yes";
        return "no";
    }

    public String hasTape() {
        return exist(tape);
    }

    public String hasDisk() {
        return exist(disk);
    }


    public String hasRadio() {
        return exist(radio);
    }

    public String toString() {
        return "Recorder: tape = " + hasTape() + ", disk = " + hasDisk() + ", radio = " + hasRadio();
    }

    public void setConfiguration(boolean tape, boolean disk, boolean radio){
        this.tape = tape;
        this.disk = disk;
        this.radio = radio;
    }
}
