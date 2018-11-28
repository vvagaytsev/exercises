package other;

/**
 * @author Vladimir Vagaytsev
 * Date: 28/11/2018
 */
public class EuclidianAlgorithm {

    public static void main(String[] args) {
        int a = 1071;
        int b = 464;
        System.out.println(findGCD(a, b));
    }

    private static int findGCD(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int dividend, divisor, remainder;
        if (a > b) {
            dividend = a;
            divisor = b;
        } else {
            dividend = b;
            divisor = a;
        }
        remainder = dividend % divisor;
        if (remainder != 0) {
            return findGCD(divisor, remainder);
        }
        return divisor;
    }
}