package easy;

/**
 * Given an array arr,
 * replace every element in that array with the greatest element among the elements to its right, and
 * replace the last element with -1.
 * After doing so, return the array.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {

    }
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = -1;
        for(int i = arr.length-1; i >= 0; i--){
            res[i] = max;
            max = Math.max(max, arr[i]);
        }
        return res;
    }
}
