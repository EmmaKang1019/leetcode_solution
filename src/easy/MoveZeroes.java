package easy;

/**
 * Given an integer array nums,
 * move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int le = 0;
        for(int right = 0; right<nums.length; right++){
            if(nums[right] !=0){
                int temp = nums[right];
                nums[right] = nums[le];
                nums[le] = temp;
                le++;
            }
        }
    }
}
