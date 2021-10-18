package com.company.dataStructures;

import java.util.Arrays;

public class UnchangeableList {
    private int[] data;

    public UnchangeableList(UnchangeableList l){
        this(l.getData());
    }

    public UnchangeableList(int ... arr){
        setData(arr);
    }

    public void setData(int ... arr){
        data = Arrays.copyOf(arr, arr.length);
    }

    public int getValue(int index){
        if (index < 0 || index > this.data.length)
            throw new ArrayIndexOutOfBoundsException(index + " is not legal argument");
        return this.data[index];
    }

    public int[] getData(){
        return Arrays.copyOf(this.data, this.data.length);
    }

    public boolean isEmpty(){
        if (this.data.length == 0)
            return true;
        else
            return false;
    }

    public void replace(int value, int index){
        if (index < 0 || index > this.data.length-1)
            throw new ArrayIndexOutOfBoundsException(index + " is not legal argument");
        this.data[index] = value;
    }

    public int getSize(){
        return this.data.length;
    }

    public String toString(){
        String toRet = "[";
        for (int i: this.data)
            toRet += i + ", ";
        toRet += "\b\b]";
        return toRet;
    }
}
