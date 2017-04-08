package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Abiturient {
    private long id;
    private String name;
    private String phone;
    private int evaluation;

    public Abiturient() {
    }

    public Abiturient(long id, String name, String phone, int evaluation) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.evaluation = evaluation;
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

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }
    @Override
    public String toString() {
        String s = "" + id + ". " + name + " - " + evaluation;
        return s;
    }
}
