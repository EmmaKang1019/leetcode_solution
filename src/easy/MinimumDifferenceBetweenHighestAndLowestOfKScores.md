# Problem. 1984. Minimum Difference Between Highest and Lowest of K Scores
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.


## Solution
When finding the differnce between the maximum and minimum among k elements, if the array is sotred,
the subarray with the minimun difference must lie within k consecutive elements. Therefore, we first sort the given nums.
Then, we initialize the variable min to Integer.MAX_VALUE( the largest possible integer) so that any smaller value encountered will correctly update it.
This problem can be solved using a sliding window of size k. We set the left pointer to 0 and the right pointer to k-1 so that the initial window contains exactly k elements.
As the right pointer moves through the array until it reaches the end, we check the difference between nums[right] and nums[left] for each window 
and keep track of the smallest difference as min.

```commandline
class Solution {
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
```