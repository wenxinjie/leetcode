//Count the number of prime numbers less than a non-negative number, n.
//
//Example:
//
//Input: 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

package wenxinjie2;

import java.util.Arrays;

public class leetcode204_Count_Primes {
    public int countPrimes(int n) {
        int[] res = new int[n+1];
        Arrays.fill(res,1);
        res[0] = 0; res[1] = 0;
        for(int i = 0; i < n+1; i ++){
            if (res[i] == 1){
                for (int j = 2; j< (n / i) + 1; j ++ ){
                    res[i * j] = 0;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i ++){
            sum += res[i];
        }
        return sum;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy