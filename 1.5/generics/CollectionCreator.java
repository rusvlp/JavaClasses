package com.company.generics;

import java.util.Collection;

public abstract class CollectionCreator <T>{
    public abstract Collection<T> createCollection();

    public abstract void addToCollection(T obj);
}
