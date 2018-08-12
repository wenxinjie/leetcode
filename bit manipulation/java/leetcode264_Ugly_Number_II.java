//Write a program to find the n-th ugly number.
//
//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
//
//Example:
//
//Input: n = 10
//Output: 12
//Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.


package wenxinjie3;

import java.util.ArrayList;
import java.util.List;

public class leetcode264_Ugly_Number_II {
	public int nthUglyNumber(int n) {
        List<Integer> res = new ArrayList<Integer>();
        int p1 = 0, p2 = 0, p3 = 0;
        res.add(1);
        for (int i = 0; i < n - 1; i ++){
            int n1 = 2 * res.get(p1), n2 = 3 * res.get(p2), n3 = 5 * res.get(p3);
            int min = MIN(n1, n2, n3);
            if (n1 == min) p1++;
            if (n2 == min) p2++;
            if (n3 == min) p3++;
            res.add(min);
        }
        int ans = res.get(res.size()-1);
        return ans;            
    }
    
    public int MIN(int a, int b, int c){
        if (a <= b && a <= c ) return a;
        else if (b <= a && b <= c) return b;
        else if (c <= a && c <= b) return c;
        return 0;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium