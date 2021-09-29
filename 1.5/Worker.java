package com.company;

public class Worker {
    public String name;
    private Department dept;

    public Worker(String name, Department dept){
        this(name);
        this.dept = dept;
    }

    public Worker(String name){
        this.name = name;
    }

    public void setDept(Department d){
        if (this.dept == null){
            this.dept = d;
            return;
        }

        if (this.dept.getHead() != this)
            this.dept = d;
        else{
            this.dept.setHead(null);
            this.dept = d;
        }


    }



    public String toString(){
        if (dept!=null)
            return name + ", отдел " + dept;
        else return name;
    }
}
