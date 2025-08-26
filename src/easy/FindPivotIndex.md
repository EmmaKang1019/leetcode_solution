# Problem 724. Find Pivot Index
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

## Solution
To get the left total, we can simply keep adding the current numnber(pivot number) as we iterate. Since the for loop goes form index 0 to upward, we can accumulate the sum step by step
However, to calculate the right total, we take the overall total and subtract both the left total and the current pivot number.  

Therefore, we declare a variable total and iterate through the entire array to calculate total sum.
After that, we declare an inter variable leftTotal and use a new for loop to compute both the left and right totals.
Inside the loop, the right total is calculated as `total - leftTotal - nums[i]`, which overwrite the value each time.
For this reason, the rightTotal variable must be declared inside the loop so that it is reinitialized and updated on every iteration.(This was the part I didn't understand before)
After obtaining the new rightTotal, we check whether leftTotal equal to rightTotal. If left total equal rightTotal, we return the current index i.
Otherwise, we keep updating leftTotal using the += operator.
If no indix satisfies the condition after the loop finishes, we return -1 outside the for loop

```commandline
   public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num:nums){
            total += num;
        }
        int leftTotal = 0;
        for(int i = 0; i<nums.length; i++){
            int rightTotal = total - leftTotal - nums[i];
            if(rightTotal == leftTotal){
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }
```