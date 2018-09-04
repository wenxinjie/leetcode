//Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.
//
//Example 1:
//
//Input: 2
//Output: 1
//Explanation: 2 = 1 + 1, 1 × 1 = 1.
//Example 2:
//
//Input: 10
//Output: 36
//Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.

package wenxinjie3;

public class leetcode343_Integer_Break {
    public int integerBreak(int n) {
        int ans = 1;
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        while (n >= 3){
            n -= 3;
            ans *= 3;
        }
        if (n == 0) return ans;
        if (n == 1) return (int)(ans/3 * 4);
        if (n == 2) return  ans * 2;
        return 0;
    }
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: medium