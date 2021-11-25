package com.company.geometry;

import java.util.ArrayList;

public class Group implements Moveable{
    ArrayList<Moveable> fs = new ArrayList<>();

    public void offset(Coordinates cs, int offset){
        for (Moveable toMove: fs){
            toMove.offset(cs, offset);
        }
    }
}
