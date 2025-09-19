package easy;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int res = 0;
        hash.put('I',1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        for(int i = 0; i<s.length()-1; i++){
            if(hash.get(s.charAt(i)) < hash.get(s.charAt(i+1))){
                res -= hash.get(s.charAt(i));
            }else{
                res += hash.get(s.charAt(i));
            }
        }
        return res + hash.get(s.charAt(s.length()-1)) ;
    }
}
