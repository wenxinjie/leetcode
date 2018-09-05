//Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
//
//Example:
//
//Input: 2
//Output: 91 
//Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, 
//             excluding 11,22,33,44,55,66,77,88,99

package wenxinjie4;

public class leetcode357_Count_Numbers_with_Unique_Digits {
    public int countNumbersWithUniqueDigits(int n) {
        int[] pool = {9, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int res = 1;
        int product = 1;
        
        for (int i = 0; i < Math.min(n, 10); i++){
            product *= pool[i];
            res += product;
        }
        return res;
    }	
}


//Time: O(1)
//Space: O(1)
//Difficulty: medium