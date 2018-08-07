//Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
//
//Note that the row index starts from 0.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//Example:
//
//Input: 3
//Output: [1,3,3,1]


package wenxinjie2;

import java.util.ArrayList;
import java.util.List;

public class leetcode119_Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> cur = new ArrayList<Integer>();       
        for(int i=0; i<rowIndex + 1; i++)
	    {
		cur.add(0, 1);
		for(int j=1; j<cur.size()-1; j++)
			cur.set(j, cur.get(j) + cur.get(j+1));		
	    }
        return cur;
    }
}


//Time: O(n^2)
//Space: O(k)
//Difficulty: easy