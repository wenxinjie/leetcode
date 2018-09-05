//
//Write an algorithm to determine if a number is "happy".
//
//A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//
//Example: 
//
//Input: 19
//Output: true
//Explanation: 
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

package wenxinjie2;

import java.util.HashSet;

public class leetcode202_Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while ( n != 1){
            int res = 0;
            if (set.contains(n)) return false;
            set.add(n);
            while (n > 0){
                res += Math.pow((n % 10), 2); 
                n /= 10;
            }
            n = res;
        }
        return true;
    }
}


//Time: O(1)
//Space: O(1)
//Difficulty: easy