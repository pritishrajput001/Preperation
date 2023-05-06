package com.array;

public class ReverseArray {

	public static void main(String args[]) {

		int[] arr = { 3, 90, 45, 29, 37, 78 };

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		System.out.println("Reversed Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}