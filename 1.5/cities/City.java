package com.company.cities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    public String name;
    private List<Road>  roads = new ArrayList<>();


    public City(String name){
        this.name = name;
    }

    public City(String name, Road ... rs){
        this(name);
        setUnknownRoads(rs);
    }

    public void addRoads(Road ... rs){
        boolean flag = true;

        for (Road r: rs){
            for (Road r1: this.roads){
                if (r1.compareTo(r)){
                    flag = false;
                    break;
                }
            }
            if ((r.getCity(1) == this || r.getCity(2) == this) && flag)
                roads.add(r);
            else
                throw new IllegalArgumentException("City is not legal");
        }
    }

    public List<Road> getRoads(){
       return new ArrayList<>(this.roads);
    }


    private String roadsString(){
        String res = "";

        for (Road r: this.roads)
            res += r + "\n";
        res += "\b";

        return res;
    }

    public void setUnknownRoads(Road ... roads){
        Road[] toSet = new Road[roads.length];
        int countOfLegalRoads = 0;

        for (Road r: roads){
            if (r.getCity(1) == this || r.getCity(2) == this)
                toSet[countOfLegalRoads++] = r;
        }

        addRoads(Arrays.copyOf(toSet, countOfLegalRoads));

    }



    public String toString(){
        return name + " roads:\n" + roadsString();
    }
}
