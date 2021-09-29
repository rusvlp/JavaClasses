package com.company;


public class House{
    public final int stages;

    public House(int stages){
        this.stages = stages;
    }

    public String toString(){
        if (stages <=0) return "Странный дом...";
        if (stages == 11) return "Дом с " + stages + " этажами";
        if (stages % 10 == 1) return "Дом с " + stages + " этажом";
        return "Дом с " + stages + " этажами";
    }
}

