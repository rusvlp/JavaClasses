package com.company;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void first(){

        Point p1 = new Point(1,3);
        Line l = new Line(p1, new Point(23, 8));
        System.out.println(l);

        Point p2 = new Point(25, 10);
        Line l2 = new Line(new Point(5, 10) , p2);
        System.out.println(l2);

        Line l3 = new Line(p1, p2);
        System.out.println(l3);

        p1.x = 5;
        p1.y = 5;

        System.out.println("------------------");
        p2.x = 20;
        p2.y = 20;
        System.out.println(l2);
        System.out.println(l3);

        l.start = new Point(30, 30);
        System.out.println("------------------");
        System.out.println(l);

    }

    public static void second(){
        Human[] hs = new Human[3];
        hs[0] = new Human("Клеопатра", 152, "f");
        hs[1] = new Human("Алексндр", "Пушкин", "Сергеевич", 167, "m");
        hs[2] = new Human("Владимир", "Маяковский", 189, "m");

        for(Human h: hs)
            System.out.println(h);
    }

    public static void third(){
        Human ivan = new Human("Иван", "Чудов", "m");
        Human peter = new Human("Петр", "Чудов", "m");
        Human boris = new Human("Борис", "m");

        peter.setFather(ivan);
        boris.setFather(peter);

        System.out.println(ivan + "\n" + peter + "\n" + boris);
    }

    public static void main(String[] args) {
        third();
    }
}
