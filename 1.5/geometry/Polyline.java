package com.company.geometry;

import java.util.ArrayList;
import java.util.List;

public class Polyline implements Measurable {
    public List<Point> points = new ArrayList<>();



    public Polyline(Point ... points){
        for (Point p: points)
            this.points.add(p);

    }

    public Polyline(){}

    public void addPoints(Point... ps){
        for (Point p: ps)
            points.add(p);

    }

    public void addPoints(Polyline pl){
        this.addPoints(pl.getArrayPoints());
    }

    public Point[] getArrayPoints(){
        Point[] toRet = new Point[points.size()];
        for (int i = 0; i<points.size(); i++){
            toRet[i] = points.get(i);
        }

        return toRet;
    }

    public Line getLine(){
        return new Line(points.get(0), points.get(points.size()-1));
    }

    public int length(){
        int sumLine = 0;

        for (int i = 0; i<points.size()-1; i++){
            sumLine+= (new Line(points.get(i), points.get(i+1))).length();
        }

        return sumLine;
    }

    public String toString(){
        String res = "Polyline: ";
        for (Point p: points) res+= p + ", ";
        res+="\b\b";
        return res;
    }

    @Override
    public int hashCode() {
        int sum = 0;

        for (Point p : points)
            sum+=p.hashCode();

        return sum;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;

        if (obj.getClass() != this.getClass())
            return false;
        if (this == obj)
            return true;


        Polyline toEqual = (Polyline)obj;

        if (toEqual.getArrayPoints().length != this.getArrayPoints().length)
            return false;

        for (int i = 0; i<this.points.size(); i++){
            if (this.points.get(i) != toEqual.points.get(i))
                return false;
        }

        return true;

    }
}
