package com.company.geometry;

public class Square implements Polylineable {
    public Point first;
    private Point second;
    private Point third;
    private Point fourth;
    private int len;

    public Square(Point f, int len){
        setSquare(f, len);
    }

    public void setSquare(Point f, int len){
        this.first = f;
        setSize(len);
    }

    public void setSize(int newlen){
        if (newlen<0)
            throw new IllegalArgumentException(newlen + " is not a legal argument");;
        this.second = new Point(this.first.x + len, this.first.y);
        this.third = new Point(this.first.x + len, this.first.y + len);
        this.fourth = new Point(this.first.x, this.first.y + len);
    }

    public int getSize(){
        return len;
    }

    public Polyline toPolyline(){
        return new Rectangle.ClosedLine(this.first, this.second, this.third, this.fourth);
    }

    public String toString(){
        return "Квадрат со стороной " + this.len + " в точке " + this.first;
    }

}
