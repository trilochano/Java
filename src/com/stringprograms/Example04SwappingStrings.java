package com.stringprograms;

import java.util.Scanner;

public class Example04SwappingStrings {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first string");
		String firstString = sc.next();

		System.out.println("Enter your second string");
		String secondString = sc.next();

		System.out.println("Before Swapping      :" + firstString + "  " + secondString);
		
		firstString = firstString + secondString;
		secondString = firstString.substring(0, firstString.length() - secondString.length());
		firstString = firstString.substring(secondString.length());

		System.out.println("After Swapping       :" + firstString + "  " + secondString);

	}

}
