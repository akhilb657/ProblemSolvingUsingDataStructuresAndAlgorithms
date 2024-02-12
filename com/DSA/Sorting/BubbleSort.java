package com.DSA.Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int nums[] = {2,9,3,11,23,4,6,12};
		int len = nums.length;
		int temp;
		
		System.out.print("Elements before sorting: ");
		for(int i :nums) {
			System.out.print(i + " ");
		}
		
		
		for(int i=len-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(nums[j] > nums[j+1]) {
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.print("Elements after sorting: ");
		for(int i:nums) {
			System.out.print(i + " ");
		}
	}

}
