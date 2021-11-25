package com.company.learning;
import com.company.comparable.MyComparable;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;

public class Student implements MyComparable<Student>, Comparable<Student>{
    private String name;
    private List<Integer> notes = new ArrayList<>();
    private Predicate<Integer> filter;
    private Deque<Undoable> undoableList = new LinkedList<>();


    public Student(String name, Predicate<Integer> filter){
        this.name = name;
        this.filter = filter;
    }




    public void setName(String name){
        String tmp = this.name;
        this.name = name;
        undoableList.push(() -> {this.name = tmp;});
    }

    public Student undo(){
        undoableList.pop().action();
        return this;
    }

    public Student(String name, Predicate<Integer> fltr, Integer ... notes){
        this(name, fltr);
        this.addNotes(notes);

    }

    public void removeNote(int index){
        List<Integer> tmp = new ArrayList<>(this.notes);
        if (index < 0 && index > this.notes.size()-1) throw new IllegalArgumentException(new IndexOutOfBoundsException());
        this.notes.remove(index);

        undoableList.push(()->{this.notes = tmp;});
    }

    public void addNotes(Integer ... notes) {
        List<Integer> tmp = new ArrayList<>(this.notes);
       for (Integer n: notes){
           if (!filter.filter(n) || filter == null) throw new IllegalArgumentException();
           this.notes.add(n);
       }

       undoableList.push(()->{this.notes = tmp;});

    }

    public String getName(){
        return this.name;
    }

    public List<Integer> getNotes(){
        return
    }

    public List<Integer> getNotes(){
        return new ArrayList<>(this.notes);
    }

    public boolean isExcellent(){
        for (int n: notes){
            if (n<5) return false;
        }
        return true;
    }

    public double average(){
        int sum = 0;
        for (int n: notes)
            sum+=n;
        return sum / notes.size();
    }

    @Override
    public int compare(Student toCompare) {
        if (this.average() > toCompare.average()) return 1;
        if (this.average() == toCompare.average()) return 0;
        return -1;
    }

    @Override
    public int compareTo(Student toCompare){
        return compare(toCompare);
    }

    @Override
    public String toString() {
        return  name  + ", " + notes.toString() ;
    }
}

