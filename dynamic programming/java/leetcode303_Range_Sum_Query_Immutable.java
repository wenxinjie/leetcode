//Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
//
//Example:
//Given nums = [-2, 0, 3, -5, 2, -1]
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3

package wenxinjie3;

public class leetcode303_Range_Sum_Query_Immutable {  
    public int[] res;
    
    public void NumArray(int[] nums) {
        int[] res = new int[nums.length + 1];
        for (int i = 1; i < nums.length+ 1; i++)
            res[i] = res[i-1] + nums[i-1];
        this.res = res;
    }
    
    public int sumRange(int i, int j) {
        return this.res[j+1] - this.res[i];
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy