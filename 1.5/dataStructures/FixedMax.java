package com.company.dataStructures;

import java.util.Arrays;

public class FixedMax extends UnchangeableList {
   /* private int length = 0;

    public FixedMax() {
        super(new int[100]);
    }

    public FixedMax(int maxSize){
        super(new int[maxSize]);
    }

    public FixedMax(FixedMax fm){
        super(fm.getData());
        this.length = fm.getData().length + 1;
    }

    public void add(UnchangeableList ul){
        if (ul.getClass() == this.getClass()){
            for (int i = 0; i<((FixedMax)ul).length; i++)
                add(ul.getValue(i));
        } else
            for (int i = 0; i<ul.getSize(); i++)
                add(ul.getValue(i));
    }

    public void add(int ... vals){
        if (this.length + vals.length > this.getSize() )
            throw new IllegalArgumentException("List is full");
        for (int v: vals)
            this.replace(v, length++);

    }

    public void insert(int index, UnchangeableList ul){
        // понавыкидывать ошибок
        if (ul.getClass() == this.getClass()){
            if (((FixedMax)ul).length + this.length == this.getSize())
                throw new IllegalArgumentException("List is not legal");
            for (int i = 0; i<((FixedMax)ul).length; i++)
                insert(index + i, ul.getValue(i));
        } else{
            if (ul.getSize() + this.length == this.getSize())
                throw new IllegalArgumentException("List is not legal");
            for (int i = 0; i<ul.getSize(); i++)
                insert(index + i, ul.getValue(i));
        }

    }

    public void remove (int index){
        if (index<0 || index > length-1)
            throw new IllegalArgumentException(index + " is not a legal argument");
        for (int i = index; i<length; i++)
            replace(getValue(i+1), i);
        length--;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty(){
        return this.length == 0;
    }

    public boolean isAddable(){
        return  !(this.length == this.getSize());
    }

    public void insert(int index, int ... vals){
        if (index < 0 || this.length + vals.length > this.getSize() )
            throw new IllegalArgumentException("List is full or index is under than zero");

        for (int currindex = index, j = 0; currindex<vals.length+index; currindex++, j++){
            for (int i = this.length; i>=currindex; i--){
                this.replace(this.getValue(i), i+1);
            }
            this.replace(vals[j], currindex);
            length++;
        }


    }

    @Override
    public int[] getData(){
        return Arrays.copyOf(super.getData(), this.length);
    }

    @Override
    public String toString(){
        String toRet = "[";

        for (int i = 0; i<length; i++)
            toRet+=this.getValue(i) + ", ";
        toRet+="\b\b]";
        return toRet;
    } */
}
