package com.numbers;

import java.util.Scanner;

public class Example05CountNoOfEvenAndOddDigits {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();

		int even_Count = 0;
		int odd_Count = 0;

		while (num > 0) {

			int rem = num % 10;
			if (rem % 2 == 0) {
				even_Count++;
			} else {
				odd_Count++;
			}

			num = num / 10;
		}

		System.out.println("Numbers of even numbers   :" + even_Count);
		System.out.println("Numbers of odd numbers    :" + odd_Count);

	}

}
