package com.company.deptsAndWorkers;

public class Worker {
    public String name;
    Department dept;

    public Worker(String name, Department dept){
        this(name);
        this.dept = dept;
    }

    public Worker(String name){
        this.name = name;
    }

    public void setDept(Department d){
        if (dept.head == this)
            this.dept.head = null;

        this.dept = d;


    }



    public String toString(){
        if (dept!=null)
            return name + ", отдел " + dept;
        else return name;
    }
}
