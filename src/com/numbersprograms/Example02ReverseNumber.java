package com.numbersprograms;

import java.util.Scanner;

public class Example02ReverseNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = scanner.nextInt();

		// Logic 1-Using Algorithm

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		// Logic 2-Using StringBuffer

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = sb.reverse();

		// Logic 3-Using StringBuilder
		StringBuffer sb1 = new StringBuffer();
		sb1.append(num);
		StringBuffer rev11 = sb1.reverse();

		System.out.println("Reverse Number   :" + rev11);

	}

}
