package com.programs.arrays;


import java.util.Scanner;

public class Example02EvenOrOddInAnArray {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Elements you want in array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements");

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}
		System.out.print("Even Numbers in An Array  :");

		for (int i = 0; i < n; i++) {

			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}

		System.out.println("");

		System.out.print("Odd Numbers in An Array   :");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}

		}
	}

}
