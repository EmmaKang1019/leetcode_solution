package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 */
public class FindTheDIfferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        /**
         * The question is asking return the numbers not appear in nums1`from nums2 with opposite numbers
         */
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }
        for(int n : set1){
            if(!set2.contains(n)) li1.add(n);
        }
        for(int n : set2){
            if(!set1.contains(n)) li2.add(n);
        }
        answer.add(li1);
        answer.add(li2);
        return answer;

    }
}
