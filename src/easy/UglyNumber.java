package easy;

/**
 * An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
 *
 * Given an integer n, return true if n is an ugly number.
 */
public class UglyNumber {
    public boolean isUgly(int n) {
        //base case
        if(n<=0) return false;
        int[] arr = new int[]{2,3,5};
        for(int i : arr){
            while(n%i ==0){
                n/=i;
            }
        }
        return n ==1;
    }
}
