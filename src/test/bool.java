package test;

public class bool {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {


        //tftf ftft
        if ((a ^ b) & (c ^ d)) return true;

        //tttt ffff
        if ((a & b) == (c & d)) return false;

        //ttff fftt
        if (!((c ^ d) | (a ^ b))) return true;

        return false;

    }

    public static void main(String[] args) {

        System.out.println(booleanExpression(true, true, false, false));
        System.out.println(booleanExpression(false, false, true, true));


        System.out.println(booleanExpression(true, false, true, false));
        System.out.println(booleanExpression(false, true, false, true));


        System.out.println(booleanExpression(true, true, true, false));
        System.out.println(booleanExpression(true, false, false, false));

        System.out.println(booleanExpression(true, true, true, true));
        System.out.println(booleanExpression(false, false, false, false));

    }

}
