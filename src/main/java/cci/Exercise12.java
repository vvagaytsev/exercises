package cci;

/**
 * @author Vladimir Vagaytsev
 * Date: 09/11/2018
 */
public class Exercise12 {

    public static void main(String[] args) {
        String s = "asdfdsaaaa";
        String answer = invert(s);
        System.out.println(answer);
    }

    private static String invert(String s) {
        char[] chars = s.toCharArray();
        char tmp;
        for (int i = 0; i < chars.length >> 1; i++) {
            tmp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = tmp;
        }
        return new String(chars);
    }
}