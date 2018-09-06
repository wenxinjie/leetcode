//Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
//
//Note:
//The length of num is less than 10002 and will be ≥ k.
//The given num does not contain any leading zero.
//Example 1:
//
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
//Example 2:
//
//Input: num = "10200", k = 1
//Output: "200"
//Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes

package wenxinjie4;

public class leetcode402_Remove_K_Digits {
    public String removeKdigits(String num, int k) {
        while (k > 0){
            k --;
            int i = 0;
            while (i < num.length() - 1){
                if (num.charAt(i) > num.charAt(i + 1)) break;
                i ++;
            }
            String tem = num.substring(0, i) + num.substring(i+1, num.length());
            num = tem;
        }
        if(num == null || num.length() == 0)
            return "0";
        else return Integer.valueOf(num).toString();
    }
}

//Time: O(n * k)
//Space: O(n)
//Difficulty: medium   