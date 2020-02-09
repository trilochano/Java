package com.programs.number;

import java.util.Scanner;

public class Example03PalidromeNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();
		int org_Num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		if (org_Num == rev) {
			System.out.println(org_Num + " This is Palidrome ");
		} else {
			System.out.println(org_Num + " This is Not Palidrome ");
		}

	}

}
