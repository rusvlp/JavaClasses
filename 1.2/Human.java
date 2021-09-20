package com.company;

public class Human {
    public Name name;
    private int height;
    private Human father;
    private String sex;

    public Human(Name name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public Human(Name name, int height, String sex){
        this(name, sex);
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException(height + " is not a legal argument");
    }

    public Human(String first, String last, String mid, int height, String sex){
        this(new Name(first, last, mid), height, sex);
    }

    public Human(String first, String last, int height, String sex){
        this(new Name(first, last), height, sex);
    }

    public Human(String first, int height, String sex){
        this(new Name(first), height, sex);
    }

    public Human(String first, String last, String mid, String sex){
        this(new Name(first, last, mid), sex);
    }

    public Human(String first, String last,  String sex){
        this(new Name(first, last), sex);
    }

    public Human(String first, String sex){
        this(new Name(first), sex);
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException(height + " is not a legal argument");
    }



    public int getHeight(){
        return this.height;
    }

    public void setFather(Human father) {
        if (father.sex.charAt(0) == 'm'){
            this.father = father;
            if (this.name.last == null) this.name.last = father.name.last;
            if (this.name.mid == null){
                if (this.sex.charAt(0) == 'm') this.name.mid = father.name.first + "ович";
                else if (this.sex.charAt(0) == 'f') this.name.mid = father.name.first + "овна";
                else this.name.mid = father.name.first + "овно";
            }
        } else
            throw new IllegalArgumentException("Father must be a male");

    }

    public Human getFather(){
        return this.father;
    }

    @Override
    public String toString(){
        if (height !=0){
            if (height < 160) return "Человек с именем " + name + " - низкий человек, рост - " + height;
            if (height > 185) return "Человек с именем " + name + " - высокий человек, рост - " + height;
            return "Человек с именем " +  name + " - средний человек, рост - " + height;
        } else return this.name.toString();

    }



}
