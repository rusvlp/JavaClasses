package com.company;

public class Name {
    public final String first;
    private String last;
    private String mid;

    public Name(String first){
        this.first = first;
    }

    public Name(String first, String last){
        this(first);
        this.last = last;
    }

    public Name(String first, String last, String mid){
        this(first, last);
        this.mid = mid;
    }

    public String getLast(){
        return this.last;
    }

    public String getMid(){
        return this.mid;
    }

    public String toString(){
        return (first == null ? "" : first) + " " +  (mid == null ? "" : mid) + " " + (last == null ? "" : last);
    }
}
