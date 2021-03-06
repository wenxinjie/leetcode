//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//Example:
//
//Input: 38
//Output: 2 
//Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
//             Since 2 has only one digit, return it.

package wenxinjie3;

public class leetcode258_Add_Digits {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return (num % 9 == 0)? 9 : num % 9;
    }	
}


//Time: O(1)
//Space: O(1)
//Difficulty: easy