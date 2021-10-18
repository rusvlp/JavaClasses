package com.company;

import com.company.geometry.Figure;
import static java.lang.Math.pow;
import static java.lang.Double.parseDouble;
import com.company.geometry.Square;

public class Arithmetic {
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
