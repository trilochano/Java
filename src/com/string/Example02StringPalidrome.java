package com.string;

import java.util.Scanner;

public class Example02StringPalidrome {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.next();
		String org_String = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (org_String.equals(rev)) {
			System.out.println(org_String + " This is Palidrome");
		} else {
			System.out.println(org_String + " This is Not Palidrome");
		}
	}

}
