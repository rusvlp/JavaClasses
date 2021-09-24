package com.company;

public class Album {
    String name;
    String author;

    public Album(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String toString(){
        return name + " - " + author;
    }
}
