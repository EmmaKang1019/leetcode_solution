package easy;

/**
 * Given an array arr,
 * replace every element in that array with the greatest element among the elements to its right, and
 * replace the last element with -1.
 * After doing so, return the array.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        /**
         * The question is asking return array that consist of greatest element among the elements to its right in given array
         * and the last element of return array is -1
         */
      /*
      for this question I should check righgt element except for current element.
      so I'm going to check from last index.
      and fill the ans array from last index.
       */
        int[] ans = new int[arr.length];
        int max = -1;
        for(int i = arr.length-1; i>=0; i--){
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }
        return ans;
    }
}
