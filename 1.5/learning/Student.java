package com.company.learning;
import com.company.comparable.MyComparable;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;

import java.util.stream.*;
public class Student implements MyComparable<Student>, Comparable<Student>{
    private String name;
    private List<Integer> notes = new ArrayList<>();
    private Predicate<Integer> filter;
    private Deque<Undoable> undoableList = new LinkedList<>();
    public List<Parent> pars = new ArrayList<>();

    public Student(String name, Predicate<Integer> filter){
        this.name = name;
        this.filter = filter;
    }

    public Student(String name, Predicate<Integer> fltr, Integer ... notes){
        this(name, fltr);
        this.addNotes(notes);

    }

    public Predicate<Integer> getPredicate(){
        return filter;
    }


    /*public static class Saver{
        private ArrayList<Saveable> saves = new ArrayList<>();

        public void save(Student st){
            String tmpName = st.name;
            ArrayList<Integer> tmpNotes = new ArrayList<>(st.notes);

            saves.add(() -> {st.name = tmpName; st.notes = tmpNotes;});
        }

        public void restore(int index){
            if (index < 0 || index > saves.size()-1)
                throw new IllegalArgumentException("save does not exist");
            saves.get(index).restore();
        }
    }*/

    public Saveable save(){
        String tmpName = this.name;
        List<Integer> tmpNotes = new ArrayList<>(this.notes);
        Predicate<Integer> tmpPredicate = this.filter;

        Saveable s = new Saveable() {
           @Override
           public void restore() {
                Student.this.filter = tmpPredicate;
                Student.this.name = tmpName;
                Student.this.notes = tmpNotes;
           }
       };
       return s;
    }

    public void restore(Saveable s){
        s.restore();
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



    public void removeNote(int index){
        List<Integer> tmp = new ArrayList<>(this.notes);
        if (index < 0 && index > this.notes.size()-1) throw new IllegalArgumentException(new IndexOutOfBoundsException());
        this.notes.remove(index);

        undoableList.push(()->{this.notes = tmp;});
    }

    public void startObserve(Parent... par){
        for (Parent p: par) this.pars.add(p);
    }

    public void addNotes(Integer ... notes) {
        List<Integer> tmp = new ArrayList<>(this.notes);
       for (Integer n: notes){
           if (!filter.filter(n) || filter == null) throw new IllegalArgumentException();
           for (Parent par: pars)
               if (par!=null)par.checkNote(n, this.filter);
           this.notes.add(n);
       }



       undoableList.push(()->{this.notes = tmp;});

    }

    public String getName(){
        return this.name;
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

