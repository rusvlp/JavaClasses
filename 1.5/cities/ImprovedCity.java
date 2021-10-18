package com.company.cities;

public class ImprovedCity extends City {

    public ImprovedCity(String name){
        super(name);
    }

    public ImprovedCity(String name, Road... roads){
        super(name, roads);
    }

    @Override
    public void addRoads(Road ... rs){
        super.addRoads(rs);
        boolean flag = true;

        for (Road r: rs){
            City f = r.getCity(1);
            City s = r.getCity(2);


            if (f == this){
                for (Road r1: s.getRoads()){
                    if (r1.compareTo(r)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    s.addRoads(r);
                }
                return;
            }

            if (s == this){
                for (Road r1: f.getRoads()){
                    if (r1.compareTo(r)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    f.addRoads(r);
                }
                return;
            }


        }

    }
}
