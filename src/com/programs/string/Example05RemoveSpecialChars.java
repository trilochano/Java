package com.programs.string;

public class Example05RemoveSpecialChars {

	public static void main(String[] args) {

		String s = "123456 !@#$%^&&&&&* WERTYUIKJVFCVBJK";
		String string = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(string);

	}

}
