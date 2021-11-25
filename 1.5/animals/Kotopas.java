package com.company.animals;

public class Kotopas extends Animal implements Meowable, Woofable{
    private Cat c;
    private Dog d;

    public Kotopas(String name){
        this.name = name;
        c.name = name;
        d.name = name;
    }

    public void getSound(){
        c.meow();
        d.woof();
    }

    public void getSound(int count){
        for (int i = 0; i<count; i++){
            c.meow();
            d.woof();
        }
    }

    public void meow(){
        c.meow();
    }

    public void woof(){
        d.woof();
    }

    public void meow(int count){
        for (int i = 0; i<count; i++) c.meow();
    }

    public void woof(int count){
        for (int i = 0; i<count; i++) d.woof();
    }
}
