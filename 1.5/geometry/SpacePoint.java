package com.company.geometry;

import com.company.geometry.Point;

public class SpacePoint extends Point {
    public int z;

    public SpacePoint(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public void offset(Coordinates cs, int value){
        if (cs == Coordinates.x)
            x+=value;
        if(cs == Coordinates.y)
            y+=value;
        if (cs == Coordinates.z)
            z+=value;
    }

    @Override
    public String toString(){
        return "{" + this.x + ", " + this.y + ", " + this.z + "}";
    }
}
