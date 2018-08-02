package com.leetcode.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**   
 * @ClassName:  Solution   
 * @Description:TODO to solve leetcode problem
 * @author: MisterDonut
 * @date:   2018年8月2日 下午1:16:35   
 *     
 */
public class Solution {
	/**   
	 * @Title: twoSum   
	 * @Description: TODO 
	 * Q1:find indexs of two 
	 * nums which sum is target.
	 * @param: @param nums
	 * @param: @param target
	 * @param: @return      
	 * @return: int[]      
	 * @throws   
	 */  
	public int[] twoSum(int[] nums, int target) {	
		int[] result = new int[2];
		boolean flag = true;
		int front = 0;
		int rear = nums.length - 1;
		while(front != rear && flag){
			while(rear != front){
				if (nums[front] + nums[rear] == target){
					flag = false;
					break;
				}
				else {
					;
				}
				rear --;
			}
			if (flag){
				front ++;
				rear = nums.length - 1;
			}
			else {
				break;
			}
			
		}
		result[0] = front;
		result[1] = rear;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] aim = {1,2,3,4};
		int[] rs = sol.twoSum(aim, 3);
		System.out.println(Arrays.toString(rs));
	}

}
