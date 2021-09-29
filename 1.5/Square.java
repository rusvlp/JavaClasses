package com.company;

public class Square {
    public Point first;
    private Point second;
    private Point third;
    private Point fourth;
    private int len;

    public Square(Point f, int len){
        this.first = f;
        this.second = new Point(f.x + len, f.y);
        this.third = new Point(f.x + len, f.y + len);
        this.fourth = new Point(f.x, f.y + len);
    }

    public Polyline toPolyline(){
        return new Polyline(this.first, this.second, this.third, this.fourth);
    }

    public String toString(){
        return "Квадрат со стороной " + this.len + " в точке " + this.first;
    }

}
