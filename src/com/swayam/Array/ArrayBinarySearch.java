package com.swayam.Array;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		
		int[] a = {10,12,14,11,18,17,23};
		int data = 17;
		int l = 0;
		int h = a.length-1;
		
		for(l = 0; l <= h; l++) {
			
			int m = (l + h)/2;		// setting the mid point 
			
			if(data > a[m]) {
				
				l = m + 1;			// discarding lower half
			}
			else if(data < a[m]) {
				
				h = m - 1;			// discarding higher half
			}
			else {
				System.out.println(m);
				return;
			}
		}
		System.out.println("Element not found");


	}

}
