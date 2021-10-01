package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) {

     ClosedLine cl = new ClosedLine(new Point(1, 2), new Point(4, 3), new Point(5, 5));
     Polyline pl = new Polyline(new Point(1, 2), new Point(4, 3), new Point(5, 5));

     System.out.println(cl.lengthLine());
     System.out.println(pl.lengthLine());
    }


}


