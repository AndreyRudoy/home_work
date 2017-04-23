package com.rudoy.hm015.Issue3;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Computer {
    String processor;
    double processorFrequency;
    boolean wiFi;

    private String exist(boolean wiFi) {
        if (wiFi) return "yes";
        return "no";
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String wiFi() {
        return exist(wiFi);
    }

    public void setProcessorFrequency(double processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }
    public String toString(){
        return "computer: processor = "+processor+", processor frequency = "+processorFrequency+", WiFi = "+wiFi();
    }
}