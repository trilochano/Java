package com.numbers;

import java.util.Scanner;

public class Example04CountNumberOfDigits {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		System.out.println("Number of Digits   :" + count);

	}

}
