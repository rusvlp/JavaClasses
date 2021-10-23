package com.company.mathematic;

import com.company.geometry.Figure;
import static java.lang.Math.pow;
import static java.lang.Double.parseDouble;
import com.company.geometry.Square;
import java.math.BigInteger;

public class Arithmetic {

    public static BigInteger bigIntegerSum(Number ... ns){
        BigInteger sum = new BigInteger("0");

        for (Number n: ns){
            if (n.getClass() == BigInteger.class){
                sum.add((BigInteger) n);
            }
            sum.add(new BigInteger(Integer.toString(n.intValue())));
        }

        return sum;
    }

    public static double sum(Number ... ns){
        double res = 0;
        for (Number n: ns)
            res += n.doubleValue();
        return res;
    }

    public static double stringPow(String x1, String y1){
        return pow(parseDouble(x1), parseDouble(y1));
    }
}
