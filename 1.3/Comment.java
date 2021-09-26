package com.company;


import java.util.ArrayList;
import java.util.List;

public class Comment{
    public String text;
    public int rate;
    public List<Comment> subcomms = new ArrayList<Comment>();
    public int lvl;

    public Comment(int rate, String text){
        this.rate = rate;
        this.text = text;
        this.lvl = 0;
    }

    public void setSubcomms(List<Comment> subcomms) {
        this.subcomms = subcomms;
    }

    public void addSubcomms(Comment ... coms){
        for (Comment c: coms)
            this.subcomms.add(c);
    }

    private String scString(){
        if (subcomms == null) return "";

        String toRet = "\n";
        for (Comment c: subcomms){
            c.lvl = this.lvl+1;
            toRet += c;
        }

        return toRet;
    }

    public String toString(){
        String level = "";
        for (int i = 0; i<this.lvl; i++)
            level+="---";

        return level + "(" + rate + ")" + " " + text  + scString();
    }

}


