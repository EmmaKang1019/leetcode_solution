# Problem 303. Range Sum Query - Immutable
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).


## Solution
First declare a prefixSum array to store the cumulative sums.
Since calculating the range sum or every function call would be inefficient, we precompute to cumulative sums in the constructor
and then use them during the function calls.
The prefixSum array is created with a size one greater than the input nums array. Because It stores cumulative sums,
each element is calcuated with the fomula
`prefixSum[i] = prefixSum[i - 1] + nums[i - 1]`.
prefixSum is one element longer than nums and its 0th index is initialized to 0, we can use i-1 concept here.
To get the range sum, subtract prefixSum[left] (the sum up to the left index, not included) from prefixSum[right + 1] (the sum up to the right index, included).



```
public class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length+1];
        for(int i = 1; i<=nums.length; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }
}
```