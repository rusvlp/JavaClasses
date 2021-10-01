package com.company;

public class Song {
    String name;
    String[] coAuthors;
    final Album album;

    public Song(String name, Album alb){
        this.name = name;
        this.album = alb;

        alb.addSong(this);

    }

    private String coAuthSt(){
        String res ="";

        if (coAuthors != null){
            for (String s: coAuthors) res+=s + ", ";
            res+="\b\b";
        }
        return res;
    }

    public String toString(){
        if (album != null) return name + " - " + album.author + (coAuthors != null ? ", "  : "") + coAuthSt();
        else return name + coAuthSt();
    }
}
