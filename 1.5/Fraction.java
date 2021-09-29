package com.company;

public class Fraction {
    int num;
    int den;

    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Fraction add(Fraction f){
        return new Fraction(this.num * f.den + f.num * this.den, f.den * this.den);
    }

    public Fraction substract(Fraction f){
        return new Fraction(this.num * f.den - f.num * this.den, f.den * this.den);
    }

    public Fraction multiply(Fraction f){
        return new Fraction(this.num * f.num, this.den * f.den);
    }

    public Fraction divide(Fraction f){
        return new Fraction(this.num * f.den, f.num * this.den);
    }

    public String toString(){
        return num + "/" + den;
    }
}
