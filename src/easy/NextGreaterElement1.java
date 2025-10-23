package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * The next greater element of some element x in an array
 * is the first greater element
 * that is to the right of x in the same array.
 * You are given two distinct 0-indexed integer arrays nums1 and nums2,
 * where nums1 is a subset of nums2.
 * For each 0 <= i < nums1.length,
 * find the index j such that nums1[i] == nums2[j]
 * and determine the next greater element of nums2[j] in nums2.
 * If there is no next greater element,
 * then the answer for this query is -1.
 * Return an array ans of length nums1.length
 * such that ans[i] is the next greater element as described above.
 */
public class NextGreaterElement1 {

    /**
     next greater element 는 first greater element에 바로 오른쪽에 있는것
     나는 두개의 0인덱스드인 어레이 두개가 있는데 nums1은 nums2의 서브셋임
     i가 0보다 크고 nums1의 길이보다 작을때 인덱스 j를 찾는데 이떄 j는 nums[i] == nums2[j]를 만족하는 ㅓ
     그리고 num2에 있는 next greater element를 찾는거. 만약 거기 next greater element가 없으면 -1을 리턴
     nums1의 길이만큼의 ans 어레이를 리턴하는데 이때 ans[i]는 nextgreater element이다.
     예시를 보면 nums1의 4는 ㅜums2에서도 4인데 이거보다 큰게 없어 그래서 -1로 채우고
     nums1의 1은 nums2의 첫요소인데 이거보다 큰건 3임. 바로 오른쪽 옆에 있는거니까
     nums1의 2는 nums2의 마지막요소인데 그거보다 큰건 없음 마지막요소니까 그래서 -1을 채우기
     */

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int n : nums2){
            while( ! stack.isEmpty() && n > stack.peek()){
               map.put(stack.pop(), n);
            }
            stack.add(n);
        }
        for(int i = 0; i< nums1.length; i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }

}
