package easy;
/*
Given an integer array nums of length n,
you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        /*
        the question is asking return array that has 2 times length with given array nums
        and the return array consist of element i == i and i+n == i
         */
        /*
        according to example, given array is 1,2,1 so I'm going to iterate given array and set element of ans array
         */

        // declare array
        int[] ans = new int[nums.length*2];

        for(int i = 0; i< nums.length; i++){
            ans[i] = nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
}
