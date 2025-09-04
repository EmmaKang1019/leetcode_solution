package easy;

/**
 * A phrase is a palindrome
 * if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters,
 * it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if (s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }
}
