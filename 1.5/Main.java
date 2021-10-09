package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) throws Throwable{

        FixedMax fm = new FixedMax(100);
        FixedMax fm2 = new FixedMax(5);
        fm2.add(55, 28, 33);

        UnchangeableList ul = new UnchangeableList(1, 2, 3, 4, 5);

        fm.add(ul);
        fm.insert(1, fm2);
        System.out.println(fm);
        fm.remove(1);
        System.out.println(fm);



    }


}


