package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Issue2 {
    public static void main(String[] args) {
        Patient[] patients = new Patient[]{
                new Patient(1, "Andrey", "+380506099123", 24345324, "Allergy"),
                new Patient(2, "Alina", "+380506099080", 2434552, "Aneurysm"),
                new Patient(3, "Masha", "+380506099045", 2434432, "Vitiligo"),
                new Patient(4, "Vitya", "+380506099453", 2434132, "Hemisinusitis"),
                new Patient(5, "Victor", "+380506099076", 2437532, "Candidiasis"),
                new Patient(6, "Sasha", "+380506099023", 2434932, "Sarcoidosis")
        };
        int startInterval = 0;
        int endInterval = 514351435;
        for (int i = 0; i < patients.length; i++) {
            if ((patients[i].getMedicalCard() > startInterval) & (patients[i].getMedicalCard() < endInterval)) {
                System.out.println(patients[i].toString());
            }
        }
    }
}
