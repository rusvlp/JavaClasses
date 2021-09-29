package com.company;


public class House{
    private int stages;

    public House(int stages){
       setStages(stages);
    }

    public void setStages(int stages){
        if (stages > 0)
            this.stages = stages;
        else
            throw new IllegalArgumentException(stages + " is not a legal argument");
    }

    public String toString(){
        if (stages <=0) return "Странный дом...";
        if (stages == 11) return "Дом с " + stages + " этажами";
        if (stages % 10 == 1) return "Дом с " + stages + " этажом";
        return "Дом с " + stages + " этажами";
    }
}

