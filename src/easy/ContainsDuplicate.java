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
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
