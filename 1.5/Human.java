package com.company;

public class Human {
    public Name name;
    private int height;
    private Human father;
    private String sex;

    public Human(){}

    public Human(Name name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public Human(Name name, int height, String sex){
        this(name, sex);
        setHeight(height);
    }

    public Human(Name name, int height, String sex, Human father){
        this(name, height, sex);
        setFather(father);
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

    public Human(String first, int height, String sex, Human father){
        this(new Name(first), height, sex);
        setFather(father);
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
        if (height > 0 && height <= 500)
            this.height = height;
        else
            throw new IllegalArgumentException(height + " is not a legal argument");
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight(){
        return this.height;
    }

    private void setFather(Human father) {
        if (father.sex.charAt(0) == 'm'){
            this.father = father;
            if (this.name.getLast() == null) this.name = new Name(this.name.first, father.name.getLast(), this.name.getMid());
            if (this.name.getMid() == null){
                if (this.sex.charAt(0) == 'm') this.name = new Name(this.name.first, this.name.getLast(), father.name.first + "ович");
                else if (this.sex.charAt(0) == 'f') this.name = new Name(this.name.first, this.name.getLast(), father.name.first + "овна");
                else this.name = new Name(this.name.first, this.name.getLast(), father.name.first + "овно");
            }
        } else
            throw new IllegalArgumentException("Father must be a male");

    }

    public Human getFather(){
        return this.father;
    }

    public Name getName(){
        return this.name;
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

