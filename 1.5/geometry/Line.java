package com.company.geometry;

import com.company.geometry.Measurable;
import com.company.geometry.*;

public class Line<T extends Point> implements Measurable, Cloneable{
    public T start;
    public T end;

    Line(){}

    public Line(T start, T end){
        setPoint(1, start);
        setPoint(2, end);
    }

    //public Line (int xs, int ys, int xe, int ye){
    //    this(new T(xs, ys), new T(xe, ye));
   // }


    public void setPoint (int index, T point){
        if (index <= 0 && index > 2) throw new IllegalArgumentException(index + " is not a legal argument");
        if (index == 1){
            if (point.getClass() != end.getClass()) throw new IllegalArgumentException(point + ": class of accepted point does not match class of contained point");
            this.start = point;
            return;
        }
        if (index == 2){
            if (point.getClass() != start.getClass()) throw new IllegalArgumentException(point + ": class of accepted point does not match class of contained point");
            this.end = point;
            return;
        }
    }
    public int length(){
        return (int)Math.sqrt((end.x-start.x) * (end.x-start.x) + (end.y-start.y) * (end.y-start.y));
    }

    public static class Builder<T extends Point>{
        Line<T> l;

        public Builder setStart(T start){
            if (l == null) l = new Line<T>();
            else if (l.end != null)
            l.start = start;
            return this;
        }

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
    public Line clone() throws CloneNotSupportedException{
        Line l = (Line)super.clone();
        l.start = this.start.clone();
        l.end = this.end.clone();
        return l;
    }

    public String toString(){
        return "Line from " + start + " to " + end;
    }
}
