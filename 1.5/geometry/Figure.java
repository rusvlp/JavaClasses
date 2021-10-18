package com.company.geometry;

public abstract class Figure{
    Point start;

    public Figure(Point p){
        this.start = p;
    }

    public Figure(int x, int y){
        this(new Point(x, y));
    }

    public abstract int getSquare();

}
