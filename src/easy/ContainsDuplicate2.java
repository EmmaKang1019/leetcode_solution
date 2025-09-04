package easy;

import java.util.HashMap;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array
 * such that nums[i] == nums[j] and abs(i - j) <= k.
 */
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i]))<= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
