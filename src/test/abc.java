package test;

import static java.lang.Math.abs;

public class abc {

    public static boolean doubleExpression(double a, double b, double c) {
        System.out.println(abs(c - (a + b)));

        return abs(c - (a + b)) < 0.0001;
        //return a + b == c;
    }

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));
    }

}
