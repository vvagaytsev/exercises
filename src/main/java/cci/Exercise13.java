package cci;

import java.util.Arrays;

/**
 * @author Vladimir Vagaytsev
 * Date: 09/11/2018
 */
public class Exercise13 {

    public static void main(String[] args) {
        String answer1 = removeDuplicates("aaaa");
        System.out.println(answer1);

        String answer2 = removeDuplicates("abcd");
        System.out.println(answer2);

        String answer3 = removeDuplicates("");
        System.out.println(answer3);

        String answer4 = removeDuplicates("aaaabbbb");
        System.out.println(answer4);

        String answer5 = removeDuplicates("abababa");
        System.out.println(answer5);
    }

    private static String removeDuplicates(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        return new String(chars);
    }
}