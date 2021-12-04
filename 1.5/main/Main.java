package com.company.main;

import com.company.generics.StaticMethodHolder;
import com.company.temperature.Temperature;
import com.company.learning.Student;
import com.company.learning.*;

import java.io.Serializable;
import java.util.ArrayList;
import com.company.learning.Saveable;

public class Main {

    public static void main(String[] args) {

        Student<LessonNote> anton = new Student<LessonNote>("Anton", (ln) -> ln.getValue() >= 2 && ln.getValue() <= 5);

        LessonNote ln1 = new LessonNote("Информатика", (x) -> x>=2 && x<=5);
        ln1.addNote("Летучка 1", 2);
        ln1.addNote("Контрольная 1", 4);
        ln1.addNote("Просто так", 2);

        LessonNote ln2 = new LessonNote("Математика", (x) -> x>=2 && x<=5);
        ln2.addNote("Тиндова", 2);
        ln2.addNote("ТиндоваCUNTрольная", 5);
        ln2.addNote("ТиндоваУДоски - леша Барисов", 2);

        anton.addNotes(ln1);
        anton.addNotes(ln2);

        System.out.println(anton);
        System.out.println(anton.average());
        System.out.println(anton.isExcellent());

        anton.undo();
        System.out.println(anton);
    }

}


