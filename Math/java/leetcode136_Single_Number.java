//
//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Example 1:
//
//Input: [2,2,1]
//Output: 1

package wenxinjie2;

public class leetcode136_Single_Number {
    public int singleNumber(int[] nums) {
        
        int n = nums.length, a = 0;
        for (int i = 0; i < n; i++){
            a ^= nums[i];
        }
        return a;
    }
}


//
//Time: O(n)
//Space: O(n) 
//Difficulty: easy