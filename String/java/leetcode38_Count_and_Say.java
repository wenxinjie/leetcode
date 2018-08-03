//The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221

//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n, generate the nth term of the count-and-say sequence.
//
//Note: Each term of the sequence of integers will be represented as a string.
//
//Example 1:
//
//Input: 1
//Output: "1"
//Example 2:
//
//Input: 4
//Output: "1211"
	
package wenxinjie;

public class leetcode38_Count_and_Say {
    public String countAndSay(int n) {
        StringBuilder sb1 = new StringBuilder("1"), sb2 = sb1;
        for (int i = 0; i < n-1; i ++){
            sb2 = new StringBuilder();
            int cnt = 0;
            char[] c = sb1.toString().toCharArray();
            char c1 = c[0];
            for (int l = 0; l < c.length; l ++){
                if (c[l] == c1) cnt ++;
                else{
                    sb2.append(cnt).append(c1);
                    c1 = c[l];
                    cnt = 1;                       
                }
            }
            sb2.append(cnt).append(c1);
            sb1 = sb2;            
        }
        return sb1.toString();
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy