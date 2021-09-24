package com.company;

public class Worker {
    public String name;
    public Department dept;

    public Worker(String name, Department dept){
        this.name = name;
        this.dept = dept;
    }

    public Worker(String name, String deptName){
        this(name, new Department(deptName));
    }

    public String toString(){
        if (dept!=null)
            return name + ", отдел " + dept;
        else return name;
    }
}
