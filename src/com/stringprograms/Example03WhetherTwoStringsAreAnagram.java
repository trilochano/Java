package com.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Example03WhetherTwoStringsAreAnagram {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first string");
		String firstString = sc.next();

		System.out.println("Enter your second string");
		String secondString = sc.next();

		if (firstString.length() != secondString.length()) {
			System.out.println("Both are Not Anagram");
		} else {

			char[] s1 = firstString.toCharArray();
			char[] s2 = secondString.toCharArray();

			Arrays.sort(s1);
			Arrays.sort(s2);

			if (Arrays.equals(s1, s2)) {
				System.out.println("Both Strings are Anagram");
			} else {
				System.out.println("Both Strings are not Anagram");
			}

		}

	}

}
