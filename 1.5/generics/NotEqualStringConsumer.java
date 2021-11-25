package com.company.generics;

import java.util.ArrayList;

public class NotEqualStringConsumer implements Consumer<ArrayList<String>, String>{
    public void push(ArrayList<String> als, String str){
        if (!als.contains(str)) als.add(str);
    }
}
