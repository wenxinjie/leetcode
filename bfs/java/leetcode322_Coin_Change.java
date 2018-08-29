//You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
//
//Example 1:
//
//Input: coins = [1, 2, 5], amount = 11
//Output: 3 
//Explanation: 11 = 5 + 5 + 1
//Example 2:
//
//Input: coins = [2], amount = 3
//Output: -1

package wenxinjie3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode322_Coin_Change {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;       
        for (int i = 1; i < amount + 1; i ++){
            List<Integer> arr = new ArrayList<Integer>();
            for (int c : coins){
                if (i - c >= 0) arr.add(dp[i - c]);
                else arr.add(Integer.MAX_VALUE);                  
            }
            dp[i] = min(arr) + 1;
        }
        return (dp[amount] == Integer.MAX_VALUE) ? -1: dp[amount];          
    }
    
    public int min(List<Integer> arr){
        int res = arr.get(0);
        for (int j = 1; j < arr.size(); j++){
            res = Math.min(res, arr.get(j));
        }
        return res;
    }
}
