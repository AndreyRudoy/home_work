package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Abiturient {
    private long id;
    private String name;
    private String phone;
    private int[] evaluations;

    public Abiturient() {
    }

    public Abiturient(long id, String name, String phone, int[] evaluations) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.evaluations = evaluations;
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

    public int[] getEvaluation() {
        return evaluations;
    }

    public void setEvaluation(int[] evaluation) {
        this.evaluations = evaluation;
    }

    public double averageMark() {
        double sum = 0;
        for (int i = 0; i < evaluations.length; i++) {
            sum = sum + evaluations[i];
        }
        return sum / evaluations.length;
    }

    public boolean hasBadMarks() {
        boolean has = false;
        for (int i = 0; i < evaluations.length; i++) {
            if (evaluations[i] < 4) has = true;
            break;
        }
        return has;
    }

    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < evaluations.length; i++) {
            if (r.length() != 0) r = r + ", ";
            r=r+evaluations[i];
        }

        String s = "" + id + ". " + name + " - " + r;
        return s;
    }
}
