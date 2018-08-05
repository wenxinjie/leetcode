//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//
//(i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
//
//You are given a target value to search. If found in the array return true, otherwise return false.
//
//Example 1:
//
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
//Example 2:
//
//Input: nums = [2,5,6,0,0,1,2], target = 3
//Output: false


package wenxinjie1;

public class leetcode81_Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int l = 0, r = nums.length - 1;
        while (l < r){
            int mid = (l + r)/2;
            if (nums[mid] == target) return true;
            while(l < mid && nums[mid] == nums[l]) l++;
            while(r > mid && nums[mid] == nums[r]) r--;
            
            if (nums[mid] >= nums[l]){
                if(nums[mid] > target && target >= nums[l]) r = mid;
                else l = mid + 1;
            }
            
            else{
                if (nums[mid] < target && target <= nums[r]) l = mid + 1;
                else r = mid;
            }
        }
        return nums[l] == target;
    }
}

//Time:O(log(n))
//Space: O(1)
//Difficulty: medium