package com.rudoy.hm013;

/**
 * Created by OmEz on 11.04.2017.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    private final long secsPerDay = 24 * 60 * 60;

    private long toSecond() {
        long years = (year - 1) * 31 * 12 * secsPerDay;
        long monthes = (month - 1) * 31 * secsPerDay;
        long days = (day - 1) * secsPerDay;
        return years + monthes + days;
    }

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean after(Date date) {
        return this.toSecond() > date.toSecond();
    }

    public boolean before(Date date) {
        return this.toSecond() < date.toSecond();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String monthStr = "";
        switch (this.month) {
            case 1:
                monthStr = "January";
                break;
            case 2:
                monthStr = "February";
                break;
            case 3:
                monthStr = "March";
                break;
            case 4:
                monthStr = "April";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "June";
                break;
            case 7:
                monthStr = "July";
                break;
            case 8:
                monthStr = "August";
                break;
            case 9:
                monthStr = "September";
                break;
            case 10:
                monthStr = "October";
                break;
            case 11:
                monthStr = "November";
                break;

            default:
                monthStr = "December";
        }
        return day + " " + monthStr + " " + year + " year";
    }

}
