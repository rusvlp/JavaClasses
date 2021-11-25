package com.company.cities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    public String name;
    List<Road>  roads = new ArrayList<>();


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

    @Override
    public int hashCode(){
        int res = 0;
        for (Road r: roads)
            res+=r.hashCode();

        return res;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (!(obj instanceof City))
            return false;
        if (obj == this)
            return true;

        City toCompare = (City)obj;

        if (toCompare.roads.size() != this.roads.size())
            return false;

        for (int i = 0; i<this.roads.size(); i++){
            if (this.roads.get(i).equals(toCompare.roads.get(i)) == false)
                return false;
        }
        return true;
    }

    public String toString(){
        return name + " roads:\n" + roadsString();
    }
}
