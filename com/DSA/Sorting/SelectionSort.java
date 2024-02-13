package com.DSA.Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int nums[] = {2,9,3,11,23,4,6,12};
		int len = nums.length;
		int temp;
		int minIndex;
		
		System.out.print("Elements before sorting: ");
		for(int i :nums) {
			System.out.print(i + " ");
		}
		
		
		for(int i=0;i<len-1;i++)
		{
			minIndex = i;
			for(int j=i+1;j<len;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex = j;
				}
			}
			temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
			
		}
		
		System.out.println();
		
		System.out.print("Elements after sorting: ");
		for(int i:nums) {
			System.out.print(i + " ");
		}
	}

}
