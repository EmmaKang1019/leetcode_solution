package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two 0-indexed integer arrays nums1 and nums2,
 * return a list answer of size 2 where:
 * answer[0] is a list of all distinct integers in nums1
 *  which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2
 *  which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 */
public class FindTheDIfferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num: nums2) set2.add(num);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        for(int num : set1){
            if(!set2.contains(num)) answer.get(0).add(num);
        }
        for(int num:set2) {
            if(!set1.contains(num)) answer.get(1).add(num);
        }
        return answer;
    }
}
