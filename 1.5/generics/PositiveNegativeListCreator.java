package com.company.generics;

import java.util.ArrayList;

public class PositiveNegativeListCreator implements Creator<ArrayList<ArrayList<Integer>>>{
    public ArrayList<ArrayList<Integer>> create(){
        ArrayList<ArrayList<Integer>> toRet = new ArrayList<>();
        toRet.add(new ArrayList<>());
        toRet.add(new ArrayList<>());

        return toRet;
    }
}
