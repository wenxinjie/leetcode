//Write a program to find the nth super ugly number.
//
//Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k.
//
//Example:
//
//Input: n = 12, primes = [2,7,13,19]
//Output: 32 
//Explanation: [1,2,4,7,8,13,14,16,19,26,28,32] is the sequence of the first 12 
//             super ugly numbers given primes = [2,7,13,19] of size 4.

package wenxinjie3;

import java.util.ArrayList;
import java.util.List;

public class leetcode313_Super_Ugly_Number {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int m = primes.length;
        int[] p = new int[m];
        int[] v = new int[m];
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < m; j++){
                v[j] = primes[j] * res.get(p[j]);
            }
            int min = Min(v);
            for(int j = 0; j < m; j++){
                if (v[j] == min){
                    p[j] ++;
                }
            }
            res.add(min);
        }
        return res.get(n-1);
    }
    
    public int Min(int[] nums){
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            res = Math.min(res, nums[i]);
        }     
        return res;
    }	
}

//Time: O(nlog(k))
//Space: O(k)
//Difficulty: medium  