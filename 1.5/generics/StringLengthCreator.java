package com.company.generics;

import java.util.ArrayList;

public class StringLengthCreator implements Creator <ArrayList<ArrayList<String>>>{
        public ArrayList<ArrayList<String>> create(){
            return new ArrayList<>();
        }
    }

