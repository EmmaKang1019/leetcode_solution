package easy;

import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 *
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int major = 0;
        int majorNum = 0;

        for(int n : nums ){
            hash.put(n, hash.getOrDefault(n,0)+1);
            if(hash.get(n)>major) {
                major = hash.get(n);
                majorNum = n;
            }
        }
        return majorNum;
    }
}
