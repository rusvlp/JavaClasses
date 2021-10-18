package com.company.geometry;

public class Geometrical {
    public static int sumSquare(Figure... fs){
        int sum = 0;

        for(Figure f: fs)
            sum += f.getSquare();

        return sum;
    }

    public static Polyline sumOfPolylines(Polylineable ... pls){
        Polyline pl = new Polyline();

        for (Polylineable p : pls){
            pl.addPoints(p.toPolyline());
        }

        return pl;
    }
}
