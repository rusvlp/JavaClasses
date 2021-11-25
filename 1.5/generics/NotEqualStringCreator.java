package com.company.generics;

import java.util.ArrayList;

public class NotEqualStringCreator implements Creator<ArrayList<String>>{
    public ArrayList<String> create(){
        return new ArrayList<>();
    }
}
