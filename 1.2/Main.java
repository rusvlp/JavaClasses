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

    public static void main(String[] args) {
        first();
    }
}
