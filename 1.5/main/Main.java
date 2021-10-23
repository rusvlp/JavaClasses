package com.company.main;
import com.company.mathematic.Arithmetic;
import com.company.mathematic.Fraction;
import com.company.songsAndAlbums.*;
import java.awt.Point;

import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Throwable{
       Point p = new Point(1, 2);
       com.company.geometry.Point p2 = new com.company.geometry.Point(3, 4);

        System.out.println(p);
        System.out.println(p2);

        Fraction f = new Fraction(4, 1);
        Object f2 = f.clone();

    }


}


class B{
    int x;
}

class A {
    B b;

    public A(){}

    public A(A toCopy){
        this.b = new B();
        b.x = toCopy.b.x;
    }

    @Override
    public String toString(){
        return "x - " + b.x + ", hashCode - " + b.hashCode();
    }
}

