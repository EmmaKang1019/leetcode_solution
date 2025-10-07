package easy;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //the question is asking return indices array which add up to target
        // I'm going to solve this problem using hash map. for searching quickly
        // and in each iteration I put the current value into the hashmap, and I'll check the differences
        // between the target and the current element. If that differences is already in the hashmap, I'll return the result

        // declare the hash map
        HashMap<Integer, Integer> hash = new HashMap<>();
        // I'm going thur loop
        for (int i = 0; i< nums.length;i ++){
            // declare num each element of nums array
            int num = nums[i];
            if(hash.containsKey(target-num)){
                return new int[]{i, hash.get(target-num)};
            }
            hash.put(num, i);
        }
        return new int[]{};
    }
}
