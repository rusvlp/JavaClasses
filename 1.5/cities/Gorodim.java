package com.company.cities;

public class Gorodim implements Runnable{
    public void run(){
        ImprovedCity a = new ImprovedCity("A");
        ImprovedCity b = new ImprovedCity("B");
        ImprovedCity c = new ImprovedCity("C");
        ImprovedCity d = new ImprovedCity("D");
        ImprovedCity e = new ImprovedCity("E");

        a.addRoads(new Road(a, b, 1), new Road(a, c, 1));
        b.addRoads(new SingleWayRoad(b, c, 1, "fs"), new Road(b, d, 1));
        d.addRoads(new Road(d, e, 1));
        e.addRoads(new SingleWayRoad(e, c, 1, "fs"));

    }
}
