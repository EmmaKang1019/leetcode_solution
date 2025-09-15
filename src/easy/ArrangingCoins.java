package easy;

/**
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 *
 * Given the integer n, return the number of complete rows of the staircase you will build.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        // n = k(k+1)/2
        long left = 0;
        long right = n;

        while(left <= right){
            long pivot = left + (right - left)/2;
            long used = pivot * (pivot +1)/2;

            if (used == n) {
                return (int)pivot;
            }
            if(n < used){
                right = pivot-1;
            }else{
                left = pivot+1;
            }
        }
        return (int) right;
    }
}
