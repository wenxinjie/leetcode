//Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//Example: 
//
//Input: s = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: the subarray [4,3] has the minimal length under the problem constraint.

package wenxinjie2;

public class leetcode209_Minimum_Size_Subarray_Sum {

    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        if (nums.length == 0) return 0;
        for (int num : nums) sum += num;
        if (sum < s) return 0;
        
        int start = 0, end = 1;
        int res = nums.length, cur = nums[0];
        while(start < nums.length || end < nums.length){
            if (cur >= s){
                res = Math.min(res, end - start);
                cur -= nums[start];
                start ++;
            }
            else if (end < nums.length){
                cur += nums[end];
                end ++;
            }
            else break;
        }
        
        return res;
    }
    
    public int minSubArrayLen1(int s, int[] nums) {       
        if (nums.length == 0) return 0;
        int n = nums.length;
        int[] tem = new int[n+1];
        for (int i = 1; i < n+1; i++){
            tem[i] = tem[i-1]+ nums[i-1];
        }
        int min = n+1, l = 0, r = 0;
        while(r <= n){
            if (tem[r] - tem[l]>=s){
                min = Math.min(min, r-l);
                l++;
            }
            else r++;
        }
        if(min == n+1)  return 0;
        else return min;
        }  
    
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium