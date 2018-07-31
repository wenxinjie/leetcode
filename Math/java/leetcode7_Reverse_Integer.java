//Given a 32-bit signed integer, reverse digits of an integer.
//Example 1:
//Input: 123
//Output: 321
//
//Example 2:
//Input: -123
//Output: -321
//
//Example 3:
//Input: 120
//Output: 21

package wenxinjie;

public class leetcode7_Reverse_Integer {
	public int reverse(int x) {
        int sign = (x > 0)? 1 : -1 ;
        int y = Math.abs(x);
        int res = 0;
        while (y > 0){
            int tail = y % 10;
            int newres = res * 10 + tail;
            if ((newres - tail) / 10 != res){
                return 0;
            } 
            res = newres;
            y /= 10;
        }
        return sign * res;
    }

}

//trick: using "(newres - tail) / 10 != res" to avoid overflow
//time: O(1)
//space: O(1)
//difficulty: easy