//Say you have an array for which the ith element is the price of a given stock on day i.
//
//Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:
//
//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
//After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
//Example:
//
//Input: [1,2,3,0,2]
//Output: 3 
//Explanation: transactions = [buy, sell, cooldown, buy, sell]

package wenxinjie3;

public class leetcode309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int buy = -prices[0], sell = 0, cooldown = 0;
        for (int i = 1; i < prices.length; i++){
            int tem1 = buy, tem2 = sell, tem3 = cooldown;
            buy = Math.max(tem1, tem3 - prices[i]);
            sell = Math.max(tem1+prices[i], tem2);
            cooldown = tem2;
        }
        return Math.max(cooldown, sell);
    }
}

//Time: O(n) 
//Space: O(1)
//Difficulty: medium  