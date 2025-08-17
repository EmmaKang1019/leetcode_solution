package easy;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int a : nums){
            if(a == 0) return 0;
            if(a <0) sign = -sign;
        }
        return sign;
    }
}
