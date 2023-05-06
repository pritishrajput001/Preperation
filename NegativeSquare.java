package com.array;

public class NegativeSquare {

	public static void main(String args[]) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 60, -9 };

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i - 1] * arr[i - 1];
			}
		}

		System.out.println("Replaced array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
