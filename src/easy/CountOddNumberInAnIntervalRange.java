package easy;

/**
 * Given two non-negative integers low and high.
 * Return the count of odd numbers between low and high (inclusive).
 *
 */
public class CountOddNumberInAnIntervalRange {
    public int countOdds(int low, int high) {
//        int tmp = 0;
//        for(int i = low; i<= high; i++){
//            if(i%2 !=0 )tmp++;
//        }
//        return tmp;
        int totalNums = high - low +1;
        int answer ;
        if((low %2 !=0) && (high %2 !=0)){
            answer = totalNums/2 +1;
        }else{
            answer = totalNums/2;
        }
        return answer;
    }
}
