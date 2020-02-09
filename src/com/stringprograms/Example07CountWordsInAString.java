package com.stringprograms;

public class Example07CountWordsInAString {

	public static void main(String[] args) {

		String s = "Welcome To Java World";

		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			if (((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))) {
				count++;

			}
		}
		System.out.println("Number of Words In A String    :" + count);

	}

}
