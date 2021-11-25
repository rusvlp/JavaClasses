package com.company.geometry;

public class PointBuilder {
    public static Point build(int x, int y){
        return new Point(x, y);
    }

    public static Point build(int x, int y, int z){
        return new SpacePoint(x, y, z);
    }
}
