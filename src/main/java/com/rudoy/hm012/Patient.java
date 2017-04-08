package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Patient {
    private long id;
    private String name;
    private String phone;
    private int medicalCard;
    private String diagnosis;

    public Patient() {
    }

    public Patient(long id, String name, String phone, int medicalCard, String diagnosis) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.medicalCard = medicalCard;
        this.diagnosis = diagnosis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(int medicalCard) {
        this.medicalCard = medicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        String s = "" + id + ". " + name + " - " + medicalCard + ", " + diagnosis;
        return s;
    }
}
