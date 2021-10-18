package com.company.animals;

import static java.lang.Math.random;

public class Cuckoo extends Bird {

    @Override
    public void sing(){
        for (int i = 0; i<1 + (int)(random() * 10); i++)
            System.out.print("Ку-ку ");
    }

}
