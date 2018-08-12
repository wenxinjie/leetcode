//
//Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
//
//Example:
//
//Input:  [1,2,1,3,2,5]
//Output: [3,5]
//Note:

package wenxinjie3;

public class leetcode260_Single_Number_III {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num: nums){
            xor ^= num;          
        }
        int[] res = new int[2];
        int c = xor & ~(xor - 1);
        
        for (int num : nums){
            if ((num & c) == 0) res[0] ^= num;
            else res[1] ^= num;
        }
        
        return res;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium