package easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *f
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int c= 0;
        while(c<first.length()&& c<last.length()){
            if(first.charAt(c) == last.charAt(c)) c++;
            else break;
        }
        return first.substring(0,c);
    }
}
