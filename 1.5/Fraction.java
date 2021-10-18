package com.company;

import static java.lang.Math.abs;

public final class Fraction extends Number {
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

    @Override
    public int intValue(){
        return num/den;
    }

    @Override
    public long longValue(){
        return ((long)(num/den));
    }

    @Override
    public float floatValue(){
        return (float)num/(float)den;
    }

    @Override
    public double doubleValue(){
        return (double)num/(double)den;
    }

    @Override
    public int hashCode(){
        return den+num;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass() != o.getClass())
            return false;

        if (this == o)
            return true;

        return (this.num == ((Fraction) o).num && this.den == ((Fraction)o).num);

    }

    public String toString(){
        return num + "/" + den;
    }
}
