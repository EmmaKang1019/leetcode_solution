package easy;

import java.util.*;

/**
 * Given an array nums of n integers
 * where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n]
 * that do not appear in nums.
 */
public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        /**
         * the question is asking return all an array of all the integers in the range 1,n that do not appear in nums
         * I'll solve this problem using hash set.
         * i'll iterate the given array, add to list a number that not appear
         */
//        BruteForce
//        HashSet<Integer> set = new HashSet<>();
//        for(it n : nums){
//            set.add(n);
//        }
//        List<Integer> list = new ArrayList<>();
//        for(int i = 1; i<= nums.length; i++){
//            if(!set.contains(i)) list.add(i);
//        }
//        return list;

//            [3,1,4,2]
        int index = -1;
        for(int i = 0; i< nums.length;i ++){
            index = Math.abs(nums[i])-1;

            if(nums[index]>0) nums[index] *=-1;
        }
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            if(nums[i]>0) li.add(i+1);
        }
        return li;
    }
}
