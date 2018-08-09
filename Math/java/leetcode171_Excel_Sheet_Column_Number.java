//Given a column title as appear in an Excel sheet, return its corresponding column number.
//
//For example:
//
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
//    ...
//Example 1:
//
//Input: "A"
//Output: 1
//Example 2:
//
//Input: "AB"
//Output: 28
//Example 3:
//
//Input: "ZY"
//Output: 701

package wenxinjie2;

public class leetcode171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int res = 0, i = 0;
        while(i < s.length()){
            res = res * 26 + s.charAt(i) - 'A' + 1;
            i ++;
        }
        return res;
    }	
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: easy