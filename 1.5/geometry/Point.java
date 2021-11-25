package com.company.geometry;

import java.util.Collection;

public class Point implements Cloneable{
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode(){
        return this.x + this.y;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || o.getClass() != this.getClass())
            return false;

        if (this == o)
            return true;



        if ( ((Point)o).x == this.x && ((Point)o).y == this.y)
            return true;
        else
            return false;
    }

    public void offset(Coordinates cs, int value){
         if (cs == Coordinates.x)
             x+=value;
         if(cs == Coordinates.y)
             y+=value;
         if (cs == Coordinates.z)
             throw new IllegalArgumentException();
    }

    @Override
    public Point clone() throws CloneNotSupportedException{
        return (Point) super.clone();
    }

    public String toString(){
        return "{" + x + ", " + y + "}";
    }
}
