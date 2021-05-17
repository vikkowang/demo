package com.vikko.demo.suanfa.year2021.month5;

/**
 * @author: vikko
 * @Date: 2021/5/13 17:46
 * @Description:
 */
public class Trap {

	public int trap(int[] height) {
		int n = height.length;
		if(n <= 2) return 0;
		int[] leftMax = new int[n];
		leftMax[0] = height[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(leftMax[i-1], height[i]);
		}
		int[] rightMax = new int[n];
		rightMax[n-1] = height[n-1];
		for (int i = n-2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i+1], height[i]);
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			 res += Math.min(leftMax[i], rightMax[i]) - height[i];
		}
		return res;
	}

}
