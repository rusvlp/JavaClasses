package com.company.generics;

public class Box <T>{
    private T content;

    public Box(){}

    public Box(T obj){
        setObject(obj);
    }

    public boolean isEmpty(){
        return content == null;
    }

    public void setObject(T obj){
        if (isEmpty()) this.content = obj;
        else throw new RuntimeException("Box isn't empty");
    }

    public T getObject(){
        if (!isEmpty()) {
            T tmp;
            tmp = this.content;
            this.content = null;
            return tmp;
        }
        else throw new RuntimeException("Box is empty!");
    }
}
