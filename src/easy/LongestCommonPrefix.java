package easy;

import java.util.Arrays;

/**
 *f
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /**
         * the qusetion is asking to find longest common prefix string amongst an array
         * I'm going to sort array strs, and compare with first and last element. since sorting, there are common prefix
         *
          */

        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int index = 0;
        while(index<a.length() && index<b.length()){
            if(a.charAt(index) == b.charAt(index)){
                index++;
            }
        }
        return a.substring(0,index);
    }
}
