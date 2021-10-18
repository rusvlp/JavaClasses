package com.company.animals;

import static java.lang.Math.random;

public class Parrot extends Bird {
    String text;

    public Parrot(String text){
        this.text = text;
    }

    @Override
    public void sing(){
        String text = this.text;
        char[] buf;

        for (int i = 0; i<1 + (int)(random() * 50); i++){
            buf = text.toCharArray();
            buf[(int)(random() * buf.length)] = buf[(int)(random() * buf.length)];

            text = "";
            for (int j = 0; j<buf.length; j++)
                text += buf[j];
        }

        System.out.println(text);

    }
}
