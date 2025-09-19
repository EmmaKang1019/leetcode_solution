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
        // the question is asking return concatenations array which ans[i]  == nums[i] and ans[i+n] == nums[i]
        // 1. declare ans which is double length of nums;
        int[] ans = new int[nums.length*2];
        // 2. rotate nums by adding ith elements to ans[i] and ans[i+n]
        for(int i = 0; i< nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
