package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string text,
 * you want to use the characters of text
 * to form as many instances of the word "balloon" as possible.
 * You can use each character in text at most once.
 * Return the maximum number of instances that can be formed.
 */
public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        /**
         * the question is asking return the maximum bumber of instance =of the word ballon can be formed
         */
        int b = 0, a = 0, n = 0, l = 0, o = 0;
        for(char s:text.toCharArray()){
            switch (s){
                case 'b' : b++; break;
                case 'a' : a++; break;
                case 'n' : n++; break;
                case 'l' : l++; break;
                case 'o' : o++; break;
            }
        }
        return Math.min(Math.min(l/2, o/2), Math.min(Math.min(b,a),n));

    }
}
