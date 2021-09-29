package com.company;

public class Dog extends Animal{
    public Dog(String name){
        this.name = name;
    }

    public void getSound(){
        System.out.println(this.name + ": гав!");
    }

    public void getSound(int count){
        String meows = "";

        for (int i = 0; i<count; i++)
            meows += "гав!-";

        meows += "\b";
        System.out.println(this.name + ": " + meows);
    }

    public String toString(){
        return "Собака: " + this.name;
    }
}
