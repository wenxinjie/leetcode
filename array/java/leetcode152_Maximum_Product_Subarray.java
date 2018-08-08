//
//Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
//
//Example 1:
//
//Input: [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

package wenxinjie2;

public class leetcode152_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] a = new int[n],  b = new int[n];
        a[0] = nums[0]; b[0] = nums[0];
        for (int i = 1; i < n ; i ++){
            a[i] = max(nums[i], nums[i] * a[i-1], nums[i] * b[i-1]);
            b[i] = min(nums[i], nums[i] * a[i-1], nums[i] * b[i-1]);
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < n; i ++){
            res = Math.max(res, a[i]);
        }
        return res;
    }
    public int max(int a, int b, int c){
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        if (c >= a && c >= b) return c;
        return 0;
    }
    public int min(int a, int b, int c){
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        if (c <= a && c <= b) return c;
        return 0;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium 