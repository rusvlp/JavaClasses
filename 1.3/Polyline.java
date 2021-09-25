package com.company;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    List<Point> points = new ArrayList<>();

    public Polyline(Point ... points){
        for (Point p: points)
            this.points.add(p);

    }

    public Line getLine(){
        return new Line(points.get(0), points.get(points.size()-1));
    }

    public String toString(){
        String res = "Polyline: ";
        for (Point p: points) res+= p + ", ";
        res+="\b\b";
        return res;
    }
}
