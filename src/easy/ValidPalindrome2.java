package easy;

import java.util.HashMap;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {

        /**
         * The question is asking if the s can be palindrome after deleting at most one character from it then return true
         *
         * I'm going to search s
         * check a and a is same, and be is middle.
         *
         * abca
         * a and last a is same
         * b and second last c is not same
         * but just only one return true
         *
         * abc
         * a and c is not smae
         * and middle b
         */
        HashMap<Character, Character> hash = new HashMap<>();
        int left=0, right = s.length()-1;
        while(left<=right){
        
        }
        return false;
    }
}
