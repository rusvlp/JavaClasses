package com.company;

import com.company.geometry.Point;

public class SpacePoint extends Point {
    public int z;

    public SpacePoint(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString(){
        return "{" + this.x + ", " + this.y + ", " + this.z + "}";
    }
}
