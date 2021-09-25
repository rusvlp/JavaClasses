package com.company;

public class HumanBuilder {
   Human hum = new Human();

    public HumanBuilder setName(Name name){
        hum.name = name;
        return this;
    }

    public HumanBuilder setName(String fn, String ln, String mn){
        hum.name = new Name(fn, ln, mn);
        return this;
    }

    public HumanBuilder setHeight(int height){
        hum.setHeight(height);
        return this;
    }

    public HumanBuilder setFather(Human father){
        hum.setFather(father);
        return this;
    }

    public HumanBuilder setSex(String sex){
        hum.setSex(sex);
        return this;
    }

    public Human getHuman(){
        return hum;
    }
}
