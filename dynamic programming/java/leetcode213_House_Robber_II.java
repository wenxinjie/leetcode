//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
//
//Example 1:
//
//Input: [2,3,2]
//Output: 3
//Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
//             because they are adjacent houses.


package wenxinjie2;

public class leetcode213_House_Robber_II {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        int norub = 0, rub = nums[0];
        for (int i = 1; i < nums.length-1; i++){
            int tem = rub;
            rub = norub + nums[i];
            norub = Math.max(norub, tem);             
        }
        int a = Math.max(rub, norub);
        
        int norub1 = 0, rub1 = nums[1];
        for (int i = 2; i < nums.length; i++){
            int tem = rub1;
            rub1 = norub1 + nums[i];
            norub1 = Math.max(norub1, tem);             
        }
        int b = Math.max(rub1, norub1);
         
        return Math.max(a, b);        
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium