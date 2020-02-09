package com.programs.number;

import java.util.Scanner;

public class Example06CountSumOfDigitsInANumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = scanner.nextInt();
		int sum = 0;

		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		System.out.println("Sum of Digits    :" + sum);

	}

}
