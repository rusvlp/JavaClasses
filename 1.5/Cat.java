package com.company;

public class Cat extends Animal{

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

    public String toString(){
        return "Кот: " + this.name;
    }

}
