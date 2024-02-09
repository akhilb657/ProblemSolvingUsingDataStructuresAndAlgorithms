package com.DSA.Searching;

public class LinearSearchAndBinarySearch {
	public static void main(String[] args) {
		//int []nums = {2,5,7,9,11,13};
		int target = 11;
		
		int []nums = new int[20000];
		
		//int res = linearSearch(nums, target);
//		int res = binarySearch(nums,target);
//		
//		if(res != -1) {
//			System.out.println("Element is at index: " + res);
//		}
//		else {
//			System.out.println("Element does not exist");
//		}
		
		linearSearch(nums, target);
		binarySearch(nums, target);
	}
		
	public static int linearSearch(int []nums, int target) {
		int steps = 0;
		for(int i=0;i<nums.length-1;i++) {
			steps++;
			if(nums[i] == target) {
				System.out.println("Number of steps required for Linear Search: " + steps);
				return i;
			}
		}
		System.out.println("Number of steps required for Linear Search: " + steps);			
		return -1;
	}
	
	public static int binarySearch(int nums[],int target) {
		
		int left = 0;
		int right = nums.length-1;
		int mid;
		
		int steps=0;
		
		while(left<=right) {
			
			steps++;
			
			mid = (left+right)/2;
			
			if(nums[mid] == target) {
				System.out.println("Number of steps required for Binary Search: " + steps);
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else {
				right = right-1;
			}
		}
		
		System.out.println("Number of steps required for Binary Search: " + steps);
		return -1;
	}
}
