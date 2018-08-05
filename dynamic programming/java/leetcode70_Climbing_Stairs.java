//You are climbing a stair case. It takes n steps to reach to the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//Note: Given n will be a positive integer.
//
//Example 1:
//
//Input: 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//
//Input: 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step

package wenxinjie1;

public class leetcode70_Climbing_Stairs {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int a = 1, b = 2, res = 0 ;
        for (int i = 3; i <= n ; i++){
            res = a + b;
            a = b; 
            b = res;
        }
        return res;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy