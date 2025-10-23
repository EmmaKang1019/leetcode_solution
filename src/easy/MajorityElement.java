package easy;

import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 *
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        /**
         * the question is asking return the element that appears more than half of n times.
         * and I can assume this elements always exists.
         * I'll solve this problem to visiting every element, store value and how many times it appears in the hash map
         * for example, nums = 3,2,3
         * so index 0 : key : 3, value : 1
         * majority : 1, theNumber : 3
         *
         * and index 1 : key 2 value 1.
         * hashMap : 3:1, 2:1
         * compare with majority and frequency of current number
         * 1 : 1
         * current number loses. so we don't update majority and theNumber
         * majority : 1, the number : 3
         *
         * index 2 : hashMap : 3:2, 2:1
         * compare with majority and frequency of current number
         * 1 : 2
         * frequency of current number win. so we change majority to 2, and the number is 3
         */

    }
}
