package com.company.Sandbox;

public class Comment {
    public String text;
    public int rate;
    public Comment[] comm;

    public Comment(int rate, String text){
        this.rate = rate;
        this.text = text;
    }

    @Override
    public String toString(){
        return this.toString(0);
    }


    public String toString(int lvl){
        String lvls ="";
        for(int i = 0; i<lvl; i++){
            lvls += "---";
        }
        if(comm == null) return lvls+"(" + rate + ")" + text;
        else {
            String tos = "";
            for(Comment c: comm){
                tos+="\n"+ c.toString(lvl+1);
            }

            return lvls+"(" + rate + ")" + text + tos;
        }
    }
}