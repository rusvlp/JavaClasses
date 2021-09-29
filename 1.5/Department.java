package com.company;

public class Department {
    public String name;
    private Worker head;

    public Department(String name){
        this.name = name;
    }

    public void setHead(Worker h){
        if (h != null){
            h.setDept(this);
            this.head = h;
        } else
            this.head = null;
    }

    public Worker getHead(){
            return this.head;
    }

    public String toString(){
        return name + (head != null ? ", начальник: " + head.name : "");
    }

}
