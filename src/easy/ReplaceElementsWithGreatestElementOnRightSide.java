package easy;

/**
 * Given an array arr,
 * replace every element in that array with the greatest element among the elements to its right, and
 * replace the last element with -1.
 * After doing so, return the array.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        /*
        the question is asking return array which replaced every element in given array
        with the greatest element among the elements to its right. and replace the last element with -1;
         */
        // 1. declare answer array
        int[] ans = new int[arr.length];
        // 1-2. declare max value for compare largest value and initialized with -1 cuz last index is -1;
        int max = -1;
        // 2. for searching quickly we can search from the right so that we can find biggest element
        for(int i = arr.length-1; i>=0; i--){
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }
        return ans;
    }
}
