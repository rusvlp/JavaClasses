package com.company;

import com.company.animals.Bird;

public class BirdMarket {
    public static void sing(Bird... bs){
        for (Bird b: bs)
            b.sing();
    }
}
