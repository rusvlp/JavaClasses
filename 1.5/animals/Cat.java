package com.company.animals;

public class Cat extends Animal implements Meowable {

    public Cat(String name){
        this.name = name;
    }

    public void getSound(){
        System.out.println(this.name + ": мяу");
    }

    public void getSound(int count){
        String meows = "";

        for (int i = 0; i<count; i++)
            meows += "мяу!-";

        meows += "\b";
        System.out.println(this.name + ": " + meows);
    }

    public void meow(){
        getSound();
    }

    public void meow(int c){
        getSound(c);
    }

    public String toString(){
        return "Кот: " + this.name;
    }

}
