package com.stringprograms;

public class Example08ReverseEachWordInString {

	public static void main(String[] args) {

		String original_String = "Welcome To Java World";
		String[] words = original_String.split(" ");
		String reverse_String = "";

		// 1St

		for (String w : words) {

			String reverse_word = "";
			for (int i = w.length() - 1; i >= 0; i--) {

				reverse_word = reverse_word + w.charAt(i);

			}

			reverse_String = reverse_String + reverse_word + " ";

		}
		System.out.println("Reverse String With Each Word As  :" + reverse_String);

		// 2Nd
		/*
		 * for (String w : words) { StringBuffer sb = new StringBuffer(w);
		 * reverse_String = reverse_String + sb.reverse().toString() + " ";
		 * 
		 * }
		 * 
		 * System.out.println("Reverse String With Each Word As  :" + reverse_String);
		 */
	}
}
