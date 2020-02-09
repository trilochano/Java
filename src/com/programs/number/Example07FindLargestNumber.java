package com.programs.number;

import java.util.Scanner;

public class Example07FindLargestNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.println("Enter second Number");
		int b = sc.nextInt();
		System.out.println("Enter third Number");
		int c = sc.nextInt();

		// Approach1--own Logic
		/*
		 * if (a > b && a > c) {
		 * 
		 * System.out.println(a + " Largest Number");
		 * 
		 * } else if (b > a && b > c) {
		 * 
		 * System.out.println(b + " Largest Number");
		 * 
		 * } else {
		 * 
		 * System.out.println(c + " Largest Number");
		 * 
		 * }
		 */

		// Approach2--Ternary Operator

		/*
		 * int largest1 = a > b ? a : b; int largest2 = c > largest1 ? c : largest1;
		 */

		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(largest + "  Largest Number");
	}

}
