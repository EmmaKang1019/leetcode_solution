package easy;

import java.util.Arrays;

/**
 * Given two strings s and t,
 * return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string
 * that is formed from the original string by deleting some
 * (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (
 * i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
//        the question is asking return true if given string s is a subsequence of t
        //I should compare s element with t element. so using two pointer I'll compare
        // 1. declare s,t pointer respectively
        int sp = 0;
        int tp = 0;
        // 2. rotate while before each pointer reach the lengths;
        while(sp<s.length() && tp<t.length()){
            // compare elements and if same, increase s pointer
            if(s.charAt(sp) == t.charAt(tp)){
                sp ++ ;
            }
            // every loop, increase t pointer
            tp++;
        }
        // if s pointer is same size with s.length it's true.
        return s.length()== sp;
    }
}
