package other;

/**
 * @author Vladimir Vagaytsev
 * Date: 28/11/2018
 */
public class ZigZag {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 4;
        System.out.println(convert(s, rows));
    }

    public static String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows < 2) {
            return s;
        }
        char[] result = new char[s.length()];
        int cur = 0;
        int step = 2 * (numRows - 1);
        for (int row = 0; row < numRows; row++) {
            int j = row;
            while (j < s.length()) {
                result[cur] = s.charAt(j);
                cur++;
                if (row != 0 && row != numRows - 1) {
                    int diag = j + step - 2 * row;
                    if (diag < s.length()) {
                        result[cur] = s.charAt(diag);
                        cur++;
                    }
                }
                j += step;
            }
        }
        return new String(result);
    }
}