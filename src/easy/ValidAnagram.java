package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given two strings s and t,
 * return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr,tarr);
    }
}
