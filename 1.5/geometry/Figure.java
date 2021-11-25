package com.company.geometry;

public abstract class Figure implements Moveable{
    Point start;

    public Figure(Point p){
        this.start = p;
    }

    public Figure(int x, int y){
        this(new Point(x, y));
    }

    public abstract int getSquare();

    public void offset(Coordinates cs, int value){
        start.offset(cs, value);
    }

}
