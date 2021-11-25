package com.company.mathematic;

import com.company.geometry.Measurable;

public class StringWrapper extends Number implements Measurable {
    public String str;

    public StringWrapper(String str){
        this.str = str;
    }

    @Override
    public int intValue(){
        return str.length();
    }

    @Override
    public long longValue() {
        return (long)intValue();
    }

    @Override
    public float floatValue(){
        return (float) intValue();
    }

    @Override
    public double doubleValue(){
        return (double) intValue();
    }

    @Override
    public int length(){
        return intValue();
    }
}
