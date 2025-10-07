package easy;

/**
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class FindTheIndexOfTheFIrstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        // the question is asking return the index of first occurence of neele in haystack. if needle is not part of haystack return -1
        if(haystack.length() < needle.length()) return -1;
        for(int i = 0; i<= haystack.length() - needle.length(); i++){
            String sub = haystack.substring(i, i+ needle.length());
            if(sub.equals(needle)) return i;

        }
        return -1;
    }
}
