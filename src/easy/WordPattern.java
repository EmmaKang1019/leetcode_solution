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
        if(words.length != pattern.length()) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for(int i = 0; i< pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!charToWord.containsKey(c)) charToWord.put(c,word);
            if(!wordToChar.containsKey(word)) wordToChar.put(word,c);

            if(!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)){
                return false;
            }
        }
        return true;
    }

}
