//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Example:
//
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]


package wenxinjie3;

public class leetcode283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int tem = nums[i];
                nums[i] = nums[p1];
                nums[p1] = tem;
                p1 ++;
            }            
        }
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy 