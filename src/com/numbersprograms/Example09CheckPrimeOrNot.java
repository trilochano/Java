package com.numbersprograms;

import java.util.Scanner;

//1.natural number >1
//2.which has two factors 1 and itself
//3.number%i it has multiple factors

public class Example09CheckPrimeOrNot {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();
		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}

				if (count == 2) {
					System.out.println(num + " is a  Prime Number");
				} else {
					System.out.println(num + " is a Not Prime Number");
				}
			}
		} else {
			System.out.println(num + " is a Not Prime Number");
		}

	}

}
