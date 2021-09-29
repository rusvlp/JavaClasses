package com.company;

import java.util.Arrays;
import java.util.List;


public class Main {


    public static void third() {
        House h = new House(228);
        System.out.println(h);
    }

    public static void fourth(){
        Time t1 = new Time(10000);
        Time t2 = new Time(2, 3, 5);

        System.out.println(t1);
        System.out.println(t2);
    }

    public static void fifth(){
        Human h = new Human("Антон", 150, "Remonedo");

        System.out.println(h);
    }

    public static void main(String[] args) {
        Publication p = new PublicationBuilder().setName("Name").setRate(5).setTags("asdasd", "sadsd").setText("asdsdasdasd").getPub();

        System.out.println(p);

    }


}


