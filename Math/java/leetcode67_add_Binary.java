//Given two binary strings, return their sum (also a binary string).
//
//The input strings are both non-empty and contains only characters 1 or 0.
//
//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"
	
package wenxinjie1;

public class leetcode67_add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1, n = b.length() - 1;
        int carry = 0;
        while (m >= 0 || n >= 0 || carry > 0){
            if (m >= 0){
                carry += (a.charAt(m) - '0');
                m --;                   
            }
            if (n >= 0) {
                carry += (b.charAt(n) - '0');
                n --;
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}


//Time: O(n)
//Space: O(n)
//Difficulty: easy