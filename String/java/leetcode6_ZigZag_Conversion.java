//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R

//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//string convert(string s, int numRows);
//Example 1:
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"


package wenxinjie;

public class leetcode6_ZigZag_Conversion {
	public String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }
        
        StringBuffer[] res = new StringBuffer[numRows];
        for(int i = 0; i < res.length; i++) res[i] = new StringBuffer();
        int row = 0;
        int direction = -1;
        for (int i = 0 ; i < s.length(); i ++){
            res[row].append(s.charAt(i));
            if (row == 0 || row == numRows -1){
                direction *= -1;
            }
            row += direction;   
        }
        String a = "";
        for (int i = 0; i < numRows; i ++ ){
            a += res[i];
        }
        return a;
    }
}

//time:O(n)
//space:O(n)
//difficulty: medium