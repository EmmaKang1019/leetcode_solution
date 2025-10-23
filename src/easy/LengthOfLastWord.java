package easy;

import java.util.Arrays;

/**
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        /**
         * The question is asking return the length of the last word
         */
        /*
        according to example, given string is Hello world.
        I'll check the last word
         */
        String[] last = s.split(" ");
        return  last[last.length-1].length();
    }
}
