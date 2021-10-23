package com.company.geometry;

import com.company.geometry.Measurable;
import com.company.geometry.Point;

public class Line implements Measurable, Cloneable{
    Point start;
    Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Line (int xs, int ys, int xe, int ye){
        this(new Point(xs, ys), new Point(xe, ye));
    }

    public int length(){
        return (int)Math.sqrt((end.x-start.x) * (end.x-start.x) + (end.y-start.y) * (end.y-start.y));
    }

    @Override
    public int hashCode(){
        return start.hashCode() + end.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (obj.getClass() != this.getClass())
            return false;
        if (obj == this)
            return true;

        if (this.start.x == ((Line)obj).start.x && this.start.y == ((Line)obj).start.y && this.end.x == ((Line)obj).end.x && this.end.y == ((Line)obj).end.y)
            return true;

        return false;
    }

    @Override
    public Object clone(){
        return new Line((Point)this.start.clone(), (Point)this.end.clone());
    }

    public String toString(){
        return "Line from " + start + " to " + end;
    }
}
