package easy;

import java.util.Arrays;

/**
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        // The question is asking return the length of the last word in the string and A word is a maxinal substring non- space characters only
        // I'm going to solve this using Substring adding String array and get last index;
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
