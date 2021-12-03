package com.company.learning;

public class Parent {
    String name;
    Predicate<Integer> check;
    String message;

    public Parent(String name, Predicate<Integer> check, String msg){
        this.check = check;
        this.name = name;
        this.message = msg;
    }

    public void checkNote(Integer n, Predicate<Integer> fltr){
        if (check.filter(n) && fltr.filter(n))
            System.out.println(this.name + ": " + this.message);
    }

    public void observe(Student s){
        s.startObserve(this);
    }
}
