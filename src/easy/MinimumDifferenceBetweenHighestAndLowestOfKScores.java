package easy;

import java.util.Arrays;

/**
 * You are given a 0-indexed integer array nums,
 * where nums[i] represents the score of the ith student.
 * You are also given an integer k.
 * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
 * Return the minimum possible difference.
 *
 *
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public int minimumDifference(int[] nums, int k) {
       if(k == 1){
           return 0;
       }
       Arrays.sort(nums);

       int min = Integer.MAX_VALUE;
       int left = 0;
       int right = k-1;
       while(right < nums.length){
           min = Math.min(min, nums[right] - nums[left]);
           left ++;
           right ++;
       }
       return min;
    }
}
