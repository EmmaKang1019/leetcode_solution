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
        int b = 0, a=0, l=0, o=0, n=0;
        int count = 0;
        for(char ch : text.toCharArray()){
            switch (ch){
                case 'a' : a++;
                case 'b' : b++;
                case 'l' : l++;
                case 'n' : n++;
                case 'o' : o++;
            }
            if(a>=1 && b>=1 && l>=2 && o>=2 && n>=1){
                count++;
                a-=1; b-=1; l-=2; o-=2; n-=1;
            }
        }
        return count;
    }
}
