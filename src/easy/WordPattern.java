package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection
 * between a letter in pattern and a non-empty word in s. Specifically:
 * Each letter in pattern maps to exactly one unique word in s.
 * Each unique word in s maps to exactly one letter in pattern.
 * No two letters map to the same word,
 * and no two words map to the same letter.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length)return false;

        HashMap<Character, String> patterMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        for(int i = 0; i<pattern.length(); i++){
            String word = words[i];
            char pat = pattern.charAt(i);

            if(! patterMap.containsKey(pat)) {
                patterMap.put(pat, word);
            }
            if(! wordMap.containsKey(word)){
                wordMap.put(word, pat);
            }

            if(! patterMap.get(pat).equals(word) || !wordMap.get(word).equals(pat)){
                return false;
            }
        }
            return true;

    }

}
