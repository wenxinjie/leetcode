package wenxinjie;

import java.util.HashMap;

public class leetcode1_two_sum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] defaultres = { 0, 0 };
		for (int i = 0; i < nums.length; i++) {
			if (map.get(target - nums[i]) != null) {
				int[] res = {i, map.get(target - nums[i])};
				return res;
			}
			map.put(nums[i], i);
		}
		return defaultres;
	}
}

//time:O(n)
//space: O(n)
//difficulty: easy
