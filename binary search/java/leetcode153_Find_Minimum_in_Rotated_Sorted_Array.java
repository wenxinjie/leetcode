//
//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//
//Find the minimum element.
//
//You may assume no duplicate exists in the array.
//
//Example 1:
//
//Input: [3,4,5,1,2] 
//Output: 1
//Example 2:
//
//Input: [4,5,6,7,0,1,2]
//Output: 0

package wenxinjie2;

public class leetcode153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int l = 0, r = nums.length - 1;
        if (nums[l] < nums[r]) return nums[l];
        else{
            while (l < r - 1) {
                int mid = (r + l)/2;
                if (nums[mid] > nums[l]) l = mid;
                else r = mid;
            }
            return Math.min(nums[l], nums[r]);
        }
    }
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: medium