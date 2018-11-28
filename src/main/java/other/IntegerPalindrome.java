package other;

/**
 * @author Vladimir Vagaytsev
 * Date: 28/11/2018
 */
public class IntegerPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1000030001));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String s = String.valueOf(x);
        int len = s.length();
        int mid = len >>> 1;
        for (int i = 0; i <= mid; i++) {
            int opp = len - i - 1;
            if (i < opp && s.charAt(i) != s.charAt(opp)) {
                return false;
            }
        }
        return true;
    }
}