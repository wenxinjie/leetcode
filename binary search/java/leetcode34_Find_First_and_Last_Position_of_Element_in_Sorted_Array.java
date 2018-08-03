//Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]


package wenxinjie;

public class leetcode34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
	public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if (nums == null || nums.length == 0)         
            return ans;
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (nums[mid] > target) r = mid - 1;
            else if (nums[mid] < target) l = mid + 1;
            else{
                l =  mid;
                r = mid ; 
                while ( r < nums.length - 1 && nums[r] == nums[r + 1]) r+=1;
                while (l > 0 && nums[l] == nums[l - 1]) l-=1;
                int[] res = {l, r};
                return res; 
            }             
        }
        return ans;        
    }
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: medium