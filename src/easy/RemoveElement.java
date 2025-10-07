package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in nums in-place.
 * The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * * Change the array nums such that the first k elements of nums
 *  contain the elements which are not equal to val.
 *  The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        /*
        the question is asking return the number of array which not equal number with val in each elements of nums array
        and the array inplace not eqaul value with val
        so move not equal value forward
         */

        // declare and initialize k
        int k = 0;
        // rotate nums array
        for(int i = 0; i<nums.length-1; i++){
            // check the current element with val. if not equal move front with k as index.
            if(nums[i] != val){
                nums[k] = nums[i];
                // as soon as change value, increase k
                k++;
            }
        }
        return k;
    }
}
