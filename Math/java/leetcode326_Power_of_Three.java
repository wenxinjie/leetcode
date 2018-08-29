//Given an integer, write a function to determine if it is a power of three.
//
//Example 1:
//
//Input: 27
//Output: true
//Example 2:
//
//Input: 0
//Output: false
//Example 3:
//
//Input: 9
//Output: true
//Example 4:
//
//Input: 45
//Output: false

package wenxinjie3;

public class leetcode326_Power_of_Three {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n > 1){
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return true;
        
//        return ( n>0 &&  1162261467%n==0);
    }
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: easy
