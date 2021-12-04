package com.company.learning;

@FunctionalInterface
public interface Predicate<T>{
    boolean filter(T x);
}
