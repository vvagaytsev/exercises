package cci;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Vladimir Vagaytsev
 * Date: 09/11/2018
 */
public class Exercise11 {

    public static void main(String[] args) {
        String s = "aabcdefg";
        boolean answer1 = hasAllUniqueChars(s);
        boolean answer2 = hasAllUniqueChars0(s);
        System.out.println(answer1);
        System.out.println(answer2);
    }

    private static boolean hasAllUniqueChars(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        char[] chars = str.toCharArray();
        for (Character c : chars) {
            if (uniqueChars.contains(c)) {
                return false;
            }
            uniqueChars.add(c);
        }
        return true;
    }

    private static boolean hasAllUniqueChars0(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}