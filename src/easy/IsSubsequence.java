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
        /**
         * The question is asking check whether given two string is subsequence or not.
         * if s is a subsequence of t, we can make s from t by deleting some words without disturbing order
         */
        /*
        according to example, s is abc and t is ahbgdc. if we delete h g d, we can make s
        t를 순회하면서 s의 값과 체크
        0; a/a store a
        1; b/h skip
            b/b store a
        투포인터 사용?

         */
        int i = 0;
        int j = 0;
        while(i<s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
