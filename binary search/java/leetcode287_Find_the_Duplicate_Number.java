//Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
//
//Example 1:
//
//Input: [1,3,4,2,2]
//Output: 2
//Example 2:
//
//Input: [3,1,3,4,2]
//Output: 3

package wenxinjie3;

public class leetcode287_Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            int cnt = 0;
            for (int num : nums){
                if (num <= mid){
                    cnt ++;
                }
            }
            if (cnt <= mid) left = mid+1;
            else right = mid;
        }
        return left;
    }
}

//Time: O(nlog(n))
//Space: O(1)
//Difficulty: medium