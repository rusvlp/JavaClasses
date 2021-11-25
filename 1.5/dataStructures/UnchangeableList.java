package com.company.dataStructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class UnchangeableList<T> {
    private List<T> data;

    public UnchangeableList(UnchangeableList c){
        T[] arr = (T[])c.data.toArray();
        setData(arr);
    }

    public UnchangeableList(T ... arr){
        setData(arr);
    }

    public void setData(T ... arr){
        data = new ArrayList<T>(Arrays.asList(arr));
    }

    public T getValue(int index){
        if (index < 0 || index > this.data.size())
            throw new ArrayIndexOutOfBoundsException(index + " is not legal argument");
        return this.data.get(index);
    }

    public List<T> getData(){
        return new ArrayList<T>(data);
    }

    public boolean isEmpty(){
        if (this.data.size() == 0)
            return true;
        else
            return false;
    }

    public void replace(T value, int index){
        if (index < 0 || index > this.data.size()-1)
            throw new ArrayIndexOutOfBoundsException(index + " is not legal argument");
        this.data.set(index, value);
    }

    public int getSize(){
        return this.data.size();
    }

    public String toString(){
        String toRet = "[";
        for (T i: this.data)
            toRet += i + ", ";
        toRet += "\b\b]";
        return toRet;
    }
}
