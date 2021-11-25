package com.company.main;

import com.company.generics.StaticMethodHolder;
import com.company.temperature.Temperature;
import com.company.learning.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Vasya", x -> true, 1, 2, 3 );
        st.addNotes(1);
        st.undo();
        System.out.println(st);
        st.removeNote(1);
        System.out.println(st);
        st.undo();
        System.out.println(st);
    }

}

