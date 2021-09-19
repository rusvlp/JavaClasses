package com.company;

public class Time {
    int sec;

    public Time(int sec){
        this.sec = sec;
    }

    public String toString(){
        return (sec / 3600) % 24 + ":" + (sec / 60) % 60  + ":" + sec % 60;
    }
}
