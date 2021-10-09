package com.company;

public class Road {
    private City first;
    private City second;
    private int price;

    {
        this.first = new City("");     // пустая строка, тк название города на практике не может быть ничем
        this.second = new City("");
    }

    public Road(City first, City second, int price){
        if (first != second && first != null && second != null){
            this.first = first;
            this.second = second;
        } else
            throw new IllegalArgumentException("Not legal city");

        setPrice(price);
    }

    public void setPrice(int price){
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException(price + " is not a legal argument");
    }

    public int getPrice(){
        return this.price;
    }

    public void setCity(int ind, City city){
        if (ind == 1 && city != second && city != null)
            this.first = city;
        else if (ind == 2 && city != first && city != null)
            this.second = city;
        else
            throw new IllegalArgumentException("Received argument(s) is not a legal");
    }

    public boolean compareTo(Road r){
        if ((r.first == this.first && r.second == this.second) || (r.first == this.second && r.second == this.first))
            return true;
        else
            return false;
    }

    public City getCity(int ind){
        if (ind == 1) return first;
        else if (ind == 2) return second;
        else throw new IllegalArgumentException("Received argument is not legal");
    }

    public String toString(){
        return "Road from " + first.name + " to " + second.name + ", price: " + price;
    }
}
