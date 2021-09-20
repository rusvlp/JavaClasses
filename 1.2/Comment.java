package com.company;

public class Comment {
    int rate;
    String text;
    Comment subcomm;

    public Comment(int rate, String text){
        this.rate = rate;
        this.text = text;
    }

    public String toString(){
        if (subcomm == null)
           return "(" + rate + ")" + " " + text;
        else return "(" + rate + ")" + " " + text + "\n" + subcomm.toString(1);
    }

    public String toString(int lvl){
        String level = "";
        for (int i = 0; i<lvl; i++) level += "---";
        return level + "(" + rate + ")" + text + (subcomm != null ? "\n" + subcomm.toString(lvl+1) : "");
    }
}
