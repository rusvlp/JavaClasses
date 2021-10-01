package com.company;

import static java.lang.Math.abs;

public final class Fraction {
    private final int num;
    private final int den;

    public Fraction(int num, int den){
        if (den == 0)
            throw new IllegalArgumentException(den + " must be not equal to zero");
        if (den < 0) {
            num = -num;
            den = -den;
        }
        this.num = num;
        this.den = den;
    }

    public Fraction(int num){
        this(num, 1);
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
