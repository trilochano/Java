package com.stringprograms;

public class Example00TotalNoOfCharsInAString {

	public static void main(String[] args) {

		String s = "Hi Good Morning";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("No of Chars    :" + count);

		// Remove White spaces
		String WithOutwhiteSpaces = s.replaceAll("\\s", "");
		System.out.println(WithOutwhiteSpaces);

	}

}
