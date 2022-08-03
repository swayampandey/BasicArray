package com.swayam.Array;
import java.util.Scanner;

public class SumOfElements {
static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of element");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the elements of array");
		for(int i = 0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Elements of array are");
		for(int i = 0; i<a.length; i++) {
			System.out.print(" "+a[i]+" ");
			sum = sum + a[i];
		}
		System.out.println();
		System.out.println("Sum of elements of array is : ");
		System.out.println(+sum);
	}

}
