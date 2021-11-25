package com.company.generics;
import java.util.ArrayList;

public class PositiveNegativeListConsumer implements Consumer<ArrayList<ArrayList<Integer>>, Integer>{
    public void push(ArrayList<ArrayList<Integer>> list, Integer i){
        if (i >= 0)
            list.get(0).add(i);
        else
            list.get(1).add(i);
    }
}
