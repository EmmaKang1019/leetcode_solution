package easy;

/**
 * You have a long flowerbed in which some of the plots are planted,
 * and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's,
 * where 0 means empty and 1 means not empty,
 * and an integer n, return true
 * if n new flowers can be planted in the flowerbed
 * without violating the no-adjacent-flowers rule and false otherwise.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i< flowerbed.length; i++){
            boolean left = i ==0 || flowerbed[i-1] ==0;
            boolean right = i == flowerbed.length-1 || flowerbed[i+1] == 0;

            if(left && right && flowerbed[i] ==0 ){
                flowerbed[i] =1;
                n --;
            }
        }
            return n <= 0;
    }
}
