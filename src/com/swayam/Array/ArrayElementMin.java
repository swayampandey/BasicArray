package com.swayam.Array;
import java.util.Scanner;

public class ArrayElementMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Elements of array are");
		for(int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]+" ");
		}
		int min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min ) {
				min = a[i];
			}
		}
		System.out.println();
		System.out.println("Minimum element of array is " +min);
	}

}
