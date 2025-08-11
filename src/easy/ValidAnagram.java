package easy;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrT);
        Arrays.sort(arrS);

        return Arrays.equals(arrS, arrT);

    }
}
