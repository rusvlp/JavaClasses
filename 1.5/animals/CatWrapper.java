package com.company.animals;

public class CatWrapper implements Meowable{
    public Cat c;
    private int meowsCount;

    public void meow(){
        c.meow();
        meowsCount++;
    }

    public int getMeowsCount(){
        return this.meowsCount;
    }
}
