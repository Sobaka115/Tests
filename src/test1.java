public class test1 {


    public static boolean isPowerOfTwo(int value) {

        int n = ( Math.abs(value) );

        if((n > 0) && ((n & (n - 1)) == 0))
            return true;
        else
            return false;

    }

        public static void main(String[] args) {
            System.out.println(isPowerOfTwo(0));
            System.out.println(isPowerOfTwo(255));
            System.out.println(isPowerOfTwo(-2));

    }
}
