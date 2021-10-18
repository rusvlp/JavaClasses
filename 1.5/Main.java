package com.company;


import com.company.dataStructures.DeepList;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Throwable{
        System.out.println(Arithmetic.sum(7, new Fraction(11, 3), 3.21, new BigInteger("123")));
        Class a = A.class;

        int[] a1 = {1, 2, 3};
        int[] a2 = int[3];

        a2 = Arrays.copyOf(a1, a1.length);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
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

