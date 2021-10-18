package com.company.geometry;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b, Point start){
        super(start);
        if (a<0 || b<0)
            throw new IllegalArgumentException("Sides must be positive");
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a, int b, int x, int y){
        this(a, b, new Point(x, y));
    }

    public Rectangle(int a, Point start){
        this(a, a, start);
    }

    public Rectangle(int a, int x, int y){
        this(a, a, new Point(x, y));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public int getSquare(){
        return a*b;
    }

    public Polyline getPolyline(){
        return new Polyline(this.start, new Point(this.start.x + a, this.start.y), new Point(this.start.x + a, this.start.y + b), new Point(this.start.x, this.start.y + b));
    }

    public boolean isSquare(){
        return a==b;
    }

    public static class ClosedLine extends Polyline {

        public ClosedLine(Point... ps){
            super(ps);
        }

        @Override
        public int length(){
            int sum = super.length();
            sum+= (new Line(points.get(0), points.get(points.size()-1))).length();
            return sum;
        }
    }
}
