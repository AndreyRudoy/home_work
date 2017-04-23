package com.rudoy.hm015.Issue3;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Laptop extends Computer{
    int diagonal;
    String firm;

    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }
    public void setFirmAndProcessor(String firm, String processor){
        super.processor = processor;
        this.firm = firm;
    }
    public String toString(){
        return "laptop: processor = "+processor+", processor frequency = "
                +processorFrequency+", WiFi = "+wiFi()+", diagonal = "+diagonal+", firm = "+firm;
    }
}
