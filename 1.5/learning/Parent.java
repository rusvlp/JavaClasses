package com.company.learning;

public class Parent<T extends AbstractNote> {
    String name;
    Predicate<T> check;
    String message;

    public Parent(String name, Predicate<T> check, String msg){
        this.check = check;
        this.name = name;
        this.message = msg;
    }

    public void checkNote(T n, Predicate<T> fltr){
        if (check.filter(n) && fltr.filter(n))
            System.out.println(this.name + ": " + this.message);
    }

    public void observe(Student s){
        s.startObserve(this);
    }
}
