package com.first;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitDemo {
	public static int binarySearch(int[] arr, int target, int i, int j) {
		System.out.println("Binary search between "+i+" and "+j);
		int index = -1;
		if(i==j && arr[i]==target) {
			return i;
		}else if(i==j && arr[i]!=target) {
			return -1;
		}
		int mid = (i+j)/2;
		System.out.println("Mid: "+mid);
		if(target==arr[mid]) {
			return mid;
		}else if(target>arr[mid]) {
			return binarySearch(arr, target, mid+1, j);
		}else if(arr[mid]>target) {
			return binarySearch(arr, target, i, mid);
		}
		return index;
	}
	public static void main(String[] args) {
		int[] nums = {2,4,6,8,10,12,14};
		System.out.println("Index of 14 is "+binarySearch(nums, 14, 0, nums.length-1));
	}
	
	@Test
	public void testSearch() {
		int[] nums = {2,4,6,8,10,12,14};
		assertEquals(5, binarySearch(nums, 14, 0, nums.length-1));
	}
}
