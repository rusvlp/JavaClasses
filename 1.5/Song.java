package com.company;

public class Song {
    String name;
    String[] coAuthors;
    Album album;

    public Song(String name){
        this.name = name;
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
