package com.company.songsAndAlbums;

import com.company.songsAndAlbums.Album;

public class Song {
    String name;
    String[] coAuthors;
    Album album;

    public Song(String name, Album alb){
        this.name = name;
        this.album = alb;

        for (Song s: alb.tracks)
            if (s == this) return;
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
