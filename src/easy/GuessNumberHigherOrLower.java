package easy;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start <= end ){
            int mid = start + (end-start)/2;
            int an = guss(mid);
            if (an == -1) end = mid-1;
            else if (an == 0) return mid;
            else start = mid+1;
        }
        return end;
    }
    public int guss(int n){
        return 1;
    }
}
