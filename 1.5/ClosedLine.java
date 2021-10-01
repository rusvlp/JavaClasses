package com.company;

public class ClosedLine extends Polyline{

    public ClosedLine(Point ... ps){
        super(ps);
    }

    @Override
    public int lengthLine(){
        int sum = super.lengthLine();
        sum+= (new Line(points.get(0), points.get(points.size()-1))).length();
        return sum;
    }
}
