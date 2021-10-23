package com.company.learning;

import com.company.learning.Note;

public class MarkBook {
    private long number;
    public String name;
    public Note[] notes;

    public MarkBook(long number){
        setNumber(number);
    }

    public MarkBook(long number, String name){
        this(number);
        this.name = name;
    }

    public MarkBook(long number, String name, Note[] notes){
        this(number, name);
        this.notes  = notes;
    }

    public void setNumber(long number) {
        if (number > 0)
            this.number = number;
        else
            throw new IllegalArgumentException(number + " is not a legal argument");
    }

    public long getNumber(){
        return this.number;
    }

    private String noteString(){
        String res = "";
        for (Note i: this.notes)
            res += i + "\n";
        res+="\b";

        return res;
    }

    public String toString(){
        return name + ", " + number +":\n" + noteString();
    }
}
