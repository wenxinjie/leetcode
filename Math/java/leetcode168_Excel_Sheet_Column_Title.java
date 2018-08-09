//Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
//For example:
//
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
//    ...
//Example 1:
//
//Input: 1
//Output: "A"
//Example 2:
//
//Input: 28
//Output: "AB"

package wenxinjie2;

public class leetcode168_Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n >0){
            n--;
            int a = n % 26;
            n /= 26;
            sb.insert(0, (char)('A' + a));
        }
        return sb.toString();
    }
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: easy