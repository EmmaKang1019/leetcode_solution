package easy;

import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic
 * if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with
 * another character while preserving the order of characters.
 * No two characters may map to the same character,
 * but a character may map to itself.
 *
 * Simply, each character of both strings should be a pair, that means their indices should be the same.
 *
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        /**
         * The question is asking that two string is isomorphic.
         * the isomorphic means the characters of s can be replaced from t
         * and while preserving the order of characters, all occurrences of a characters must be replaced with
         * another characters. two characters may not map to the same character. but a characters can map to itself
         */
        HashMap<Character, Integer> sMap = new HashMap();
        HashMap<Character, Integer> tMap = new HashMap();
        // base case
        if(s.length() != t.length()) return false;

        for(int i = 0; i< s.length(); i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), i);
            }
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),i);
            }

            if(sMap.get(s.charAt(i)).equals(tMap.get(t.charAt(i)))){
                return true;
            }
        }
        return false;
    }
}
