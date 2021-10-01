package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String name;
    String author;
    private List<Song> tracks = new ArrayList<>();

    public Album(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void addSong(Song ... songs){
        for (Song s: songs){
            if (s.album == this)
                tracks.add(s);
        }
    }

    public List getSongs(){
        return new ArrayList<>(this.tracks);
    }

    public String toString(){
        return name + " - " + author;
    }
}
