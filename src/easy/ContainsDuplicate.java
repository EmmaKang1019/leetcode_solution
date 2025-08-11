package easy;

import java.util.ArrayList;

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : nums){
            if(list.contains(a)) return true;
            list.add(a);
        }
        return false;
    }
}
