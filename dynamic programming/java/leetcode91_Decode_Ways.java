//A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
//Given a non-empty string containing only digits, determine the total number of ways to decode it.
//
//Example 1:
//
//Input: "12"
//Output: 2
//Explanation: It could be decoded as "AB" (1 2) or "L" (12).


package wenxinjie1;

public class leetcode91_Decode_Ways {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int[] res = new int[s.length() + 1];
        res[0] = 1; 
        res[1] = 1;
        for (int i = 1; i < s.length(); i ++){
            if (s.charAt(i) == '0' && (s.charAt(i-1) == '0' || s.charAt(i-1) > '2'))    return  0;
            if (s.charAt(i) != '0') res[i+1] = res[i];
            if (9 < Integer.valueOf(s.substring(i-1, i+1)) &&  Integer.valueOf(s.substring(i-1, i+1)) < 27 ) res[i+1] += res[i-1];
        }
        return res[res.length-1];
        
    }
}

//Time:O(n)
//Space: O(n)
//Difficulty: medium