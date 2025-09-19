package easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        // sorting nums for checking very near duplicate numbers
//        Arrays.sort(nums);
//        for(int i = 1; i< nums.length; i++){
//            if(nums[i] == nums[i-1]) return true;
//        }
//        return false;
        // or we can solve this problem using Hash Set.
        // It's similar with what I used with  ArrayList.
        // but in contain method of ArrrayList timecomplexity is O(n^2) because It's array
        // however, time compliexity of Hashset's contain method is O(1) cuz it use Hash Table
        // 1. declare Hash set
        HashSet set = new HashSet();
        // 2. checking duplicated elements and add
        for(int i: nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
