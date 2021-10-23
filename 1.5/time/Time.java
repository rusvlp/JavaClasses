package com.company.time;

public class Time {
    private int sec;

    public Time(int sec){
        setSec(sec);
    }

    public Time(int h, int m, int s){
        this(h*3600 + m * 60 + s);
    }

    public void setSec(int sec){
        if (sec > 0 && sec < 24 * 3600)
            this.sec = sec;
        else
            throw new IllegalArgumentException(sec + " is not a legal argument");
    }

    public int getAbsSec(){
        return this.sec;
    }

    public int getSec(){
        return sec % 60;
    }

    public int getMin(){
        return (sec / 60) % 60;
    }

    public int getHrs(){
        return sec / 3600;
    }

    public String toString(){
        return sec / 3600 + ":" + (sec / 60) % 60  + ":" + sec % 60;
    }
}
