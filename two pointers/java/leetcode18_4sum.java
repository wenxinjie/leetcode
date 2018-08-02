//Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
//
//Note:
//
//The solution set must not contain duplicate quadruplets.
//
//Example:
//
//Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
//
//A solution set is:
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]

package wenxinjie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18_4sum {	
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(nums.length<4)return ans;
        Arrays.sort(nums);
        int n = nums.length, i = 0;
        while(i < n - 3){
            int n1 = nums[i], j = i + 1;
            while (j < n - 2){
                int p1 = j + 1, p2 = n - 1, n2 = nums[j];
                while (p1 < p2){
                    int sum = nums[i] + nums[j] + nums[p1] + nums[p2];
                    if (sum > target) p2 -= 1;   
                    else if(sum < target) p1 += 1;
                    else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p1], nums[p2]));
                        while (p1 < p2 && nums[p1] == nums[p1+1]) p1++;
                        while (p1 < p2 && nums[p2] == nums[p2-1]) p2--;
                        p1 += 1;
                        p2 -= 1;
                    }
                }
                while(j<n-2 && (n2 == nums[j] || nums[i] + nums[j] + nums[nums.length - 1]+ nums[nums.length-2] <target)) j++;
            }
            while(i<n-3 && (n1 == nums[i] || nums[i] + nums[nums.length - 3] + nums[nums.length - 1]+ nums[nums.length-2] <target)) i++;
        }
        return ans;
    }
    
    
    public List<List<Integer>> fourSum2(int[] num, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(num.length<4)return ans;
        Arrays.sort(num);
        for(int i=0; i<num.length-3; i++){
            if(num[i]+num[i+1]+num[i+2]+num[i+3]>target)break; 
            if(num[i]+num[num.length-1]+num[num.length-2]+num[num.length-3]<target)continue; 
            if(i>0&&num[i]==num[i-1])continue; 
            for(int j=i+1; j<num.length-2; j++){
                if(num[i]+num[j]+num[j+1]+num[j+2]>target)break; 
                if(num[i]+num[j]+num[num.length-1]+num[num.length-2]<target)continue;
                if(j>i+1&&num[j]==num[j-1])continue; 
                int low=j+1, high=num.length-1;
                while(low<high){
                    int sum=num[i]+num[j]+num[low]+num[high];
                    if(sum==target){
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while(low<high&&num[low]==num[low+1])low++; 
                        while(low<high&&num[high]==num[high-1])high--; 
                        low++; 
                        high--;
                    }             
                    else if(sum<target)low++; 
                    else high--;
                }
            }
        }
        return ans;
    }
}

//Time: O(n^3)
//Space: 
//Difficulty: medium





