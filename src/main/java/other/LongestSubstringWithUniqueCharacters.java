package other;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Vladimir Vagaytsev
 * Date: 19/11/2018
 */
public class LongestSubstringWithUniqueCharacters {

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
                Iterator<Character> iterator = usedChars.iterator();
                while (iterator.hasNext() && iterator.next() != c) {
                    iterator.remove();
                }
                usedChars.remove(c);
                usedChars.add(c);
            }
        }
        if (usedChars.size() > lastKnownResult) {
            lastKnownResult = usedChars.size();
        }
        return lastKnownResult;
    }

    @Test
    public void test1() {
        Assert.assertEquals(2, lengthOfLongestSubstring("pwwkkeerrf"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(5, lengthOfLongestSubstring("pwwddkewa"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3, lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(4, lengthOfLongestSubstring("davdf"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(5, lengthOfLongestSubstring("dagvdf"));
    }

    @Test
    public void test8() {
        Assert.assertEquals(6, lengthOfLongestSubstring("ohvhjdml"));
    }
}