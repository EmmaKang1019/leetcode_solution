package easy;

import java.util.Arrays;

/**
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return  arr[arr.length-1].length();
    }
}
