package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    String name;
    String author;
    List<Song> tracks = new ArrayList<>();

    public Album(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void addSong(Song ... songs){
        for (Song s: songs)
            this.tracks.add(s);
    }


    public String toString(){
        return name + " - " + author;
    }
}
