//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//Example 1:
//
//Input: [3,0,1]
//Output: 2
//Example 2:
//
//Input: [9,6,4,2,3,5,7,0,1]
//Output: 8

package wenxinjie3;

public class leetcode268_Missing_Number {
    public int missingNumber(int[] nums) {
        int sum = SUM(nums);
        int n = nums.length;
        return n * (n + 1) / 2 - sum; 
    }
    
    public int SUM(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy