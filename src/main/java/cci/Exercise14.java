package cci;

import java.util.Arrays;

/**
 * @author Vladimir Vagaytsev
 * Date: 09/11/2018
 */
public class Exercise14 {

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "abcgefd";
        boolean answer = areAnagrams(s1, s2);
        System.out.println(answer);
    }

    private static boolean areAnagrams(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}