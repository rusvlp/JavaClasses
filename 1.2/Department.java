package com.company;

public class Department {
    public String name;
    public Worker head;

    public Department(String name){
        this.name = name;
    }

    public String toString(){
        return name + (head != null ? ", начальник: " + head.name : "");
    }

}
