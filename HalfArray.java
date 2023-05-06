package com.array;

import java.util.Arrays;

public class HalfArray {
	
	public static void halfAscHalfDsc(int[] arr)
	{ 
		       int mid = arr.length / 2;
		       
		        for (int i = 0; i < mid; i++)
		        {
		            for (int j = i + 1; j < mid; j++)
		            {
		                if (arr[i] > arr[j]) {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }
		        
		        for (int i = mid; i < arr.length; i++) 
		        {
		            for (int j = i + 1; j < arr.length; j++) 
		            {
		                if (arr[i] < arr[j])
		                {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {5,4,-9,6,8,-1};
		
		System.out.println(Arrays.toString(arr));
		
		halfAscHalfDsc( arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
