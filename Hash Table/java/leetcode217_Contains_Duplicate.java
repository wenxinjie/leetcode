//Given an array of integers, find if the array contains any duplicates.
//
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//Example 1:
//
//Input: [1,2,3,1]
//Output: true
//Example 2:
//
//Input: [1,2,3,4]
//Output: false

package wenxinjie2;

import java.util.HashSet;

public class leetcode217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums){
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}
//
//Time: O(n)
//Space: O(n)
//Difficulty: easy