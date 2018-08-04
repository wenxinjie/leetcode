//Implement pow(x, n), which calculates x raised to the power n (xn).
//
//Example 1:
//
//Input: 2.00000, 10
//Output: 1024.00000
//Example 2:
//
//Input: 2.10000, 3
//Output: 9.26100
//Example 3:
//
//Input: 2.00000, -2
//Output: 0.25000
//Explanation: 2-2 = 1/22 = 1/4 = 0.25


package wenxinjie;

public class leetcode50_Pow_x_n {
    public double myPow(double x, int n) {
        double ans = 1;
        long newN = Math.abs((long)n);
        while(newN > 0) {
            if( ( newN & 1 )==1) ans *= x;
            newN >>= 1;
            x *= x;
        }
        return n < 0 ?  1/ans : ans;
    }
}


//Time: O(log(n))
//Space: O(1)
//Difficulty: medium

// using newN & 1 instead of newN % 2 and using newN >>= 1 instead of newN / 2