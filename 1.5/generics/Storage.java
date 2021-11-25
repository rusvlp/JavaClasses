package com.company.generics;

public class Storage<T>{
    private final T obj;
    private final static Storage nullSt = new Storage(null);


    public static <T>Storage<T> createStorage(T ob, boolean acceptsNull){
        if (acceptsNull && ob == null) throw new RuntimeException();

        if (ob == null){
            return nullSt;
        }
        return new Storage<T>(ob);

    }

    private Storage(T ob){
        this.obj = ob;
    }

    public T getObj(T def) {
        if (obj == null) return def;
        return obj;
    }


}
