package com.company.generics;

import java.util.ArrayList;

public class StringLengthConsumer implements Consumer<ArrayList<ArrayList<String>>, String>{
    public void push(ArrayList<ArrayList<String>> list, String str){
        for (ArrayList<String> als: list)
            if (als.get(0).length() == str.length()) {
                als.add(str);
                return;
            }

        ArrayList<String> alsNewLength = new ArrayList<>();
        alsNewLength.add(str);
        list.add(alsNewLength);

    }
}
