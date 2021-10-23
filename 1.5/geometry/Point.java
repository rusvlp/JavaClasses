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

        return  ( ((Point)o).x == this.x && ((Point)o).y == this.y);
    }

    @Override
    public Object clone(){
        return new Point(this.x, this.y);
    }

    public String toString(){
        return "{" + x + ", " + y + "}";
    }
}
