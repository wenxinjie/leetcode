//Implement int sqrt(int x).
//
//Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
//
//Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
//
//Example 1:
//
//Input: 4
//Output: 2
//Example 2:
//
//Input: 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since 
//             the decimal part is truncated, 2 is returned.

package wenxinjie1;

public class leetcode69_Sqrt_x {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x < 4) return 1;
        if(x < 9) return 2;
        int res = helper(x, 0, x/2);
        return res;
    }
    
    public int helper(int x, int left, int right){
        int mid = (left + right) / 2;
        if (mid  <= x / mid && (mid + 1)> x/(mid + 1)) return mid;
        if (mid > x/mid) right = mid;
        if (mid < x/mid) left = mid;
        return helper(x, left, right);
    }
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: easy