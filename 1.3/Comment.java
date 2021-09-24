package com.company;


public class Comment{
    public String text;
    public int rate;
    public Comment subcomm;
    public int lvl;

    public Comment(int rate, String text){
        this.rate = rate;
        this.text = text;
        this.lvl = 0;
    }

    public String toString(){
        String lvlS = "";
        for (int i = 0; i<this.lvl; i++)
            lvlS += "---";

        if (subcomm == null)
            return lvlS + "(" + rate +")" + " " + text;
        else{
            subcomm.lvl = this.lvl + 1;
            return lvlS + "(" + rate + ")" + text + "\n" + subcomm;
        }

    }

}


