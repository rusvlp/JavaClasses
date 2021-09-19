package com.company;

public class Human {
    Name name;
    int height;

    public Human(String name, int height){
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString(){
        if (height < 160) return name + " - низкий человек";
        if (height > 185) return name + " - высокий человек";
        return name + " - средний человек";
    }
}
