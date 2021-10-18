package com.company.geometry;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.toRadians;

public class Triangle extends Figure implements Polylineable{
    private int l1, l2, l3, an1, an2, an3;

    public Triangle(int l1, int l2, int l3, int an1, int an2, Point start){
        super(start);
        if (l1<0 || l2<0 || l3<0)
            throw new IllegalArgumentException("Sides of Triangle must be positive");
        if (l1 < l2 + l3 || l2 < l1 + l3 || l3 < l1 + l2)
            throw new IllegalArgumentException("Sum of length of two sides of Triangle must be bigger than length of third side");
        if (an1 > 180 || an1 <=0 || an2 > 180 || an2<=0)
            throw new IllegalArgumentException("Angle must be bigger than zero and lower than 180 (please set degrees value)");

        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.an1 = an1;
        this.an2 = an2;
        this.an3 = 180 - (an1 + an2);

    }

    public Polyline toPolyline(){
        return new Polyline(this.start, new Point(this.start.x + l1 * (int)sin(toRadians(an1)), this.start.y + l1 * (int)cos(toRadians(an1))), new Point (this.start.x + l2 * (int)sin(toRadians(an2)), this.start.y + l2 * (int)cos(toRadians(an2))));
    }

    @Override
    public int getSquare(){
        return (int)(0.5 * l1 * l2 * sin(toRadians(an1)));
    }
}
