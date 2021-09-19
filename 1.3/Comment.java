package com.company;

public class Comment {
    int rate;
    String text;

    public Comment(int rate, String text){
        this.rate = rate;
        this.text = text;
    }

    public String toString(){
        return "(" + rate + ")" + " " + text;
    }
}
