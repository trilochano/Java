package com.programs.arrays;

import java.util.Scanner;

public class Example05FindLargestValueInAnArray {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Elements you want in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0;
		System.out.println("Enter all the elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Largest Number   :" + max);
	}

}
