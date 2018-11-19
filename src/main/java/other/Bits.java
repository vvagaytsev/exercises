package other;

/**
 * @author Vladimir Vagaytsev
 * Date: 19/11/2018
 */
public class Bits {

    public static void main(String[] args) {
        int res = 1;
        for (int i = 0; i < 10; i++) {
            res *= 2;
            System.out.println("" + res + " => " + Integer.toBinaryString(res));
        }

        long a = 11;
        System.out.println(countOneBits(a));
    }

    private static int countOneBits(long a) {
        int count = 0;
        while (a != 0) {
            count += a & 1;
            a = a >> 1;
        }
        return count;
    }


}