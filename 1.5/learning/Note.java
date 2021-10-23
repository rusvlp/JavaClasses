package com.company.learning;

public class Note {
    public String name;
    public String teacher;
    private int note;

    public Note(int note){
        setNote(note);
    }

    public Note(int note, String name){
        this(note);
        this.name = name;
    }

    public Note (int note, String name, String teacher){
        this(note, name);
        this.teacher = teacher;
    }

    public void setNote(int note){
        if (note >= 2 && note <= 5) this.note = note;
        else throw new IllegalArgumentException(note + " is not a legal argument");
    }

    public int getNote(){
        return this.note;
    }

    public String toString() {
        return name + " - " + note + ", преподаватель - " + teacher;
    }

}
