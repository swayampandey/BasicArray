package com.swayam.Array;
import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of array");
		/*
		 * length is a final variable applicable for array
		 * length variable represents the size of array		
		 */
		for(int i = 0; i < a.length; i++ ) {
			a[i] = sc.nextInt();
		}
		System.out.println("Elements of array are : ");
		for(int i = 0; i < a.length; i++ ) {
			System.out.print(" "+a[i]+" ");
			sum = sum + a[i];
		}
		System.out.println("sum : " +sum);
		sc.close();
	}

}
