//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//Example:
//
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]

package wenxinjie2;

import java.util.ArrayList;
import java.util.List;

public class leetcode118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) return res;
        List<Integer> cur = new ArrayList<Integer>();
       for(int i=0; i<numRows; i++)
	    {
		cur.add(0, 1);
		for(int j=1; j<cur.size()-1; j++)
			cur.set(j, cur.get(j) + cur.get(j+1));
		res.add(new ArrayList<Integer>(cur));
	    }
        return res;
    }
}


//Time: O(n^2)
//Space: O(n^2)
//Difficulty: easy     