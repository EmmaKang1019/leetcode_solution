# Problem 217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true  

**Constraints**  
- `1 <= nums.length <= 105`
- `-10^9 <= nums[i] <= 109`

## BruteForce
```commandline
 ArrayList list = new ArrayList();
        // add element by rotating
        for(int i : nums){
            // checking i is included in the list
            if(list.contains(i)){
                // if contains return true;
                return true;
            }
            list.add(i);

        }
        return false;
```
I solved with ArrayList. But arrayList also array, so that it takes O(n^2) time complexity for using contains method in a for loop.
However, we can solve this problem just by sorting this array.
By sorting array, we can check duplicated number very near number.

## Solution1.
```commandline
// sorting nums for checking very near duplicate numbers
 ArrayList list = new ArrayList();
        // add element by rotating
        for(int i : nums){
            // checking i is included in the list
            if(list.contains(i)){
                // if contains return true;
                return true;
            }
            list.add(i);

        }
        return false;
```
Also we can solve this problem using HashSet. The solution with Hashset is similar with what I think the way of brute force.
Using contains method of HashSet. The difference is that HashSet use HashTable, so when we use contains method, the time complexity is O(1),
while ArrayList is using array. 

```commandline
 // 1. declare Hash set
    HashSet set = new HashSet();
    // 2. checking duplicated elements and add
    for(int i: nums){
        if(set.contains(i)){
            return true;
        }
        set.add(i);
    }
    return false;
```