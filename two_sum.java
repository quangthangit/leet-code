package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class two_sum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> myMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			myMap.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int result = target - nums[i];
			if (myMap.containsKey(result) && myMap.get(result) != i) {
				return new int[] { i, myMap.get(result) };
			}
		}	
		return new int[] {} ;
	}
}
