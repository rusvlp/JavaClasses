package com.company;

public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Line (int xs, int ys, int xe, int ye){
        this(new Point(xs, ys), new Point(xe, ye));
    }

    public String toString(){
        return "Line from " + start + " to " + end;
    }
}
