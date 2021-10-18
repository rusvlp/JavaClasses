package com.company.geometry;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Point start){
        super(start);
        if (radius < 0)
            throw new IllegalArgumentException("Radius must be positive");
        this.radius = radius;
    }



    public Circle(int radius, int x, int y){
        this(radius, new Point(x, y));
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int getSquare(){
        return 2 * (int)PI * radius;
    }

}
