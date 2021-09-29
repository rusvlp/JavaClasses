package com.company;

public class Time {
    int sec;

    public Time(int sec){
        this.sec = sec;
    }

    public Time(int h, int m, int s){
        this(h*3600 + m * 60 + s);
    }

    public String toString(){
        return (sec / 3600) % 24 + ":" + (sec / 60) % 60  + ":" + sec % 60;
    }
}
