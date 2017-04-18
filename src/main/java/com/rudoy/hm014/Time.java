package com.rudoy.hm014;

/**
 * Created by OmEz on 14.04.2017.
 */
public class Time {
    private int hour;
    private int min;
    private int sec;

    public boolean before(Time other) {
        return this.toSecond() < other.toSecond();
    }

    public boolean after(Time other) {
        return this.toSecond() > other.toSecond();
    }

    public boolean isEqual(Time other){
        return this.toSecond() == other.toSecond();
    }
    public String toString (){
        return hour+":"+min+":"+sec;
    }

    private long toSecond() {
        long hours = (hour - 1) * 60 * 60;
        long mins = (min - 1) * 60;
        long secs = 60;
        return hours + mins + secs;
    }

    public Time() {
    }

    public Time(int hours, int min, int sec) throws Exception {
        setHours(hours);
        setMin(min);
        setSec(sec);
    }

    public int getHours() {
        return hour;
    }

    public void setHours(int hours) throws Exception {
        if (hours > 23 | hours < 0) {
            throw new Exception("Incorrect hours: " + hours);
        }
        this.hour = hours;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) throws Exception {
        if (min < 0 | min > 59) {
            throw new Exception("Incorrect minutes: " + min);
        }
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) throws Exception {
        if (sec < 0 | sec > 59) {
            throw new Exception("Incorrect seconds: " + sec);
        }
        this.sec = sec;
    }
}
