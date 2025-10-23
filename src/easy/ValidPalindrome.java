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
        s = s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-z0-9]","");
        int right = s.length()-1;
        char[] ch = s.toCharArray();
        for(int i = 0; i< s.length(); i++){
            if( ch[i] !=ch[right]) return false;
            right --;
        }
        return true;
    }
}
