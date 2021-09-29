package com.company;

import java.util.Arrays;

public class City {
    public String name;
    private Road[] roads;


    public City(String name){
        this.name = name;
    }

    public City(String name, Road[] rs){
        this(name);
        setUnknownRoads(rs);
    }

    public void setRoads(Road ... roads){
        for (Road r: roads)
            if ((r.getCity(1) != this && r.getCity(2) != this) || r == null)
                throw new IllegalArgumentException("City is not valid");

        this.roads = Arrays.copyOf(roads, roads.length);
    }

    public Road[] getRoads(){
        return Arrays.copyOf(roads, roads.length);
    }

    private String roadsString(){
        String res = "";

        for (Road r: this.roads)
            res += r + "\n";
        res += "\b";

        return res;
    }

    public void setUnknownRoads(Road[] roads){
        Road[] toSet = new Road[roads.length];
        int countOfLegalRoads = 0;

        for (Road r: roads){
            if (r.getCity(1) == this || r.getCity(2) == this)
                toSet[countOfLegalRoads++] = r;
        }

        setRoads(Arrays.copyOf(toSet, countOfLegalRoads));

    }

    public String toString(){
        return name + " roads:\n" + roadsString();
    }
}
