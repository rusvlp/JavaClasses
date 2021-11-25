package com.company.generics;

public class Sum implements Reducer<Integer>{
    public Integer reduce(Integer obj, Integer sum){
        return sum + obj;
    }
}
