package com.company.temperature;

public enum Temperature {
    COLD(-50, 10),
    GOOD(10, 25),
    HOT(25, 60);

    private int start;
    private int end;

    Temperature(int start, int end){
        this.start = start;
        this.end = end;
    }

    public String toString(){
        return name() + ", from " + start + ", to " + end;
    }
}
