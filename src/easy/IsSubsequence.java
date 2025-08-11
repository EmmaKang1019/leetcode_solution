package easy;
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
        char[] tarr = t.toCharArray();
        int i = 0;
        for(char c : tarr){
            if(i<s.length() && s.charAt(i) ==c){
                i++;
            }
        }
        return i == s.length();
    }
}
