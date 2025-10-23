package easy;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index
 * where the sum of all the numbers strictly to the left of the index
 * is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array,
 * then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        /**
         * pivot index를 찾아라
         * 피벗 인덱스는 그 인덱스의 바로 왼쪽에 있는 모든 수의 합인데  그게 그 인덱스의 오른쪽 모든 수의 합과 같은수가
         * 되는 인덱스가 피벗인덱스
         * 만약 인덱스가 배열의 왼쪽 끝에 있으면 왼쪽 합은 0임 왼쪽에 요소가 없으니까 오른쪽도 똑같이 적용됨
         * 피벗인덱스의 leftmost pivot index를 리턴해라 만약 그런게 없으면 -1을 리턴해라
         *
         * num이 173656 일때 피벗인덱스는 3임
         * 3을 기준으로 1+7+3은 11
         * 오른쪽은 5+6 =11임
         */
        int total = 0;
        for(int n : nums){
            total += n;
        }
        int left = 0;
        for(int i = 0; i< nums.length; i++){
            int right = total-left -nums[i];
            if(right == left )return i;
            left+= nums[i];
        }
        return -1;
    }
}
