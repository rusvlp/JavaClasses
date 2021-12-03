package com.company.main;

import com.company.generics.StaticMethodHolder;
import com.company.temperature.Temperature;
import com.company.learning.Student;
import com.company.learning.Parent;

import java.io.Serializable;
import java.util.ArrayList;
import com.company.learning.Saveable;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("Vasya", x -> x>=2 && x<=5, 5);
        Parent par1 = new Parent("Иван Иваныч", x -> x<=3, "оболтус!");
        Parent par2 = new Parent("Клавдия Николаевна", x -> x!=5, "В детский дом сдам!");
        st.startObserve(par1, par2);
        st.addNotes(2, 2, 3);
    }


}



