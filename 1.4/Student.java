package com.company;


import java.util.Arrays;

public class Student {
    public String name;
    private int[] notes;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int[] notes){
        this(name);
        this.setNotes(notes);
    }

    public void setNotes(int[] notes) {
        int[] toSet;

        for (int i: notes)
            if (i>5 || i<2) throw new IllegalArgumentException(i + " is not a legal argument");

        this.notes = Arrays.copyOf(notes, notes.length);
    }

    public int[] getNotes(){
        return Arrays.copyOf(this.notes, this.notes.length);
    }

    @Override
    public String toString() {
        return  name  + ", " + Arrays.toString(notes) ;
    }
}
