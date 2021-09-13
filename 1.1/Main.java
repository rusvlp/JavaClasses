package com.company;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(1, 2);

        Comment first = new Comment(228, "хрень");
        Comment sec = new Comment(-1, "круто");
        Comment th = new Comment(-10, "блаблабла");

        Human l = new Human("Лешенька", 188);
        Human v = new Human("Вадя", 178);
        Human t = new Human("Толик", 158);

        Name c = new Name("Клеопатра");
        Name p = new Name("Александр", "Пушкин", "Сергеевич");
        Name m = new Name("Владимир", "Маяковский");

        House[] hs = new House[3];
        hs[0] = new House(1);
        hs[1] = new House(5);
        hs[2] = new House(23);

        for (House h: hs) System.out.println(h);

    }
}
