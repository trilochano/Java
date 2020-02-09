package com.programs.number;

import java.util.Scanner;

public class Example10FactorialOfNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();
		long fact = 1;

		// Approach 1-Ascending order
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(num + "  factorial of " + fact);
	}

}
