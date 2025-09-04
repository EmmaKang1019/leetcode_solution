# Problem 680. Valid Palindrome 2
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

## Solution
It's almost similar with Valid Palindrome problem but we can delete one character that means we can move one character
So we can make another method for checking palindrome by moving one index from left or right
```
class Solution {
    public boolean validPalindrome(String s) {
       int left = 0;
        int right = s.length()-1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            
            left ++;
            right --;
        }
        return true;
    }
}
```