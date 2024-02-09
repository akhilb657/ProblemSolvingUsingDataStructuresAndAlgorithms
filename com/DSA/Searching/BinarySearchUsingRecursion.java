package com.DSA.Searching;

public class BinarySearchUsingRecursion {
	public static void main(String[] args) {
		int nums[] = {1,11,13,111,114,116,126};
		int target = 111;
		
		int left=0;
		int right = nums.length-1;
		
		int index = binarySearch(nums, target, left, right);
		
		if(index != -1) {
			System.out.println("Element is at index : " + index);
		}
		else {
			System.out.println("Element not found");
		}
	}
	
	public static int binarySearch(int nums[], int target, int left, int right) {
		if(left<=right) {
		int mid = (left+right)/2;
		if(nums[mid] == target) {
			return mid;
		}
		
		else if (nums[mid] > target) {
			binarySearch(nums, target, left, mid-1);
		}
		else {
			binarySearch(nums, target, mid+1, right); 
		}
	}
	return -1;	
	}

}
