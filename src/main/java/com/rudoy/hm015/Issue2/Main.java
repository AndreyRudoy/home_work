package com.rudoy.hm015.Issue2;

/**
 * Created by OmEz on 23.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Recorder recorder = new Recorder();
        recorder.radio = true;
        recorder.disk = false;
        recorder.tape = true;
        System.out.println(recorder.toString());

        MusicCentre musicCentre = new MusicCentre();
        musicCentre.setModel("Panasonic", "Panasonic inc.");
        musicCentre.setConfiguration(true, false, true);
        System.out.println(musicCentre.toString());
    }
}
