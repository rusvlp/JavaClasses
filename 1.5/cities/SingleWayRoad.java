package com.company.cities;

public class SingleWayRoad extends Road{
    private String direction;

    public SingleWayRoad(City first, City second, int price, String direction){
        super(first, second, price);
        if (direction!="fs" || direction!="sf")
            throw new IllegalArgumentException("Use 'fs' to from First city to Second city direction or 'sf' to Second city to First City direction");

        this.direction = direction;
    }
}
