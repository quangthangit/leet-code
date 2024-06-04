package leetcode;

public class container_with_more_water {
	class Solution {
		public static int maxArea(int[] height) {
		        int left = 0;
		        int right = height.length - 1; 
		        int maxArea = 0; 

		        while (left < right) {
		            int width = right - left;
		            int minHeight = Math.min(height[left], height[right]);
		            int currentArea = width * minHeight;
		            
		            maxArea = Math.max(maxArea, currentArea);
		            
		            if (height[left] < height[right]) {
		                left++;
		            } else {
		                right--;
		            }
		        }
		        return maxArea;
		    }
		}
}
