package com.company.learning;

public abstract class AbstractNote {

    String name;

    public abstract double getValue();

    public AbstractNote(String name){
        this.name = name;
    }

    public String toString(){return name + ": " + getValue();}
}
