package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void first(){
        Gun g = new Gun(3);

        g.shoot();
        g.shoot();
        g.shoot();
        g.shoot();
    }

    public static void second(){

        List<Animal> animals = new ArrayList();

        animals.add(new Cat("Барсик"));
        animals.add(new Dog("Рекс"));
        animals.add(new Dog("Шарик"));

        for (Animal a: animals) a.getSound(5);


    }

    public static void main(String[] args) {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");

        Road ab = new Road(a, b, 3);
        Road ab2 = new Road(a, b, 55);

        a.setRoads(ab, ab2);




    }


}


