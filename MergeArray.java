package com.array;


import java.util.Arrays;

public class MergeArray {
	public static void main() {
		int arr1[] = { 2, 3, 5, 7, 1, 12, 10 };
		int arr2[] = { 15, 36, 23, 67 };
		int arr1L = arr1.length;
		int arr2L = arr2.length;
		int arr3L = arr1L + arr2L;
		int[] arr3 = new int[arr3L];
		System.arraycopy(arr1, 0, arr3, 0, arr1L);
		System.arraycopy(arr2, 0, arr3, arr1L, arr2L);
		System.out.println(Arrays.toString(arr3));

	}
}
