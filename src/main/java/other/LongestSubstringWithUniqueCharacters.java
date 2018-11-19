package other;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Vladimir Vagaytsev
 * Date: 19/11/2018
 */
public class LongestSubstringWithUniqueCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkkeerrf"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("pwwddkewa"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        Set<Character> usedChars = new LinkedHashSet<>();
        int lastKnownResult = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!usedChars.add(c)) {
                if (usedChars.size() > lastKnownResult) {
                    lastKnownResult = usedChars.size();
                }
                usedChars.clear();
                usedChars.add(c);
            }
        }
        if (usedChars.size() > lastKnownResult) {
            lastKnownResult = usedChars.size();
        }
        return lastKnownResult;
    }
}