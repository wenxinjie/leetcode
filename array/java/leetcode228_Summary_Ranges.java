//Given a sorted integer array without duplicates, return the summary of its ranges.
//
//Example 1:
//
//Input:  [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
//Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
//Example 2:
//
//Input:  [0,2,3,4,6,8,9]
//Output: ["0","2->4","6","8->9"]
//Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

package wenxinjie2;

import java.util.ArrayList;
import java.util.List;

public class leetcode228_Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<String>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int p1 = 0, p2 = 0;
        while (p2 < nums.length-1){
            if (nums[p2+1] == nums[p2] + 1){
                p2 ++;
            }
            else{
                List<Integer> tem = new ArrayList<Integer>();
                tem.add(nums[p1]); tem.add(nums[p2]);
                res.add(tem);
                p2 ++;
                p1 = p2;
            }          
        }
        List<Integer> tem = new ArrayList<Integer>();
        tem.add(nums[p1]); tem.add(nums[p2]);
        res.add(tem);
        List<String> ans = new ArrayList<String>();
        for(int i = 0; i < res.size(); i ++){
            if (res.get(i).get(0) == res.get(i).get(1)){
                ans.add(res.get(i).get(0).toString());
            }
            else{
                ans.add(res.get(i).get(0).toString() + "->" + res.get(i).get(1).toString());
            }
        }
        return ans;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium