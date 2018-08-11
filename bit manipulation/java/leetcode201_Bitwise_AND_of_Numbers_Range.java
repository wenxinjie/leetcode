//Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
//
//Example 1:
//
//Input: [5,7]
//Output: 4
//Example 2:
//
//Input: [0,1]
//Output: 0

package wenxinjie2;

public class leetcode201_Bitwise_AND_of_Numbers_Range {
    public int rangeBitwiseAnd(int m, int n) {
        int diff = 0;
        while (m != n){
            m >>= 1;
            n >>= 1;
            diff++;
        }
        return m << diff;
    }
}


//Time: O(1)
//Space: O(1)
//Difficulty: easy       