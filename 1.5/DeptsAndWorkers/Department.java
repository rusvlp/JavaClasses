package com.company.DeptsAndWorkers;

import com.company.DeptsAndWorkers.Worker;

public class Department {
    public String name;
    Worker head;

    public Department(String name){
        this.name = name;
    }

    public void setHead(Worker h){
        this.head = h;
        this.head.dept = this;
    }

    public Worker getHead(){
            return this.head;
    }

    public String toString(){
        return name + (head != null ? ", начальник: " + head.name : "");
    }

}
