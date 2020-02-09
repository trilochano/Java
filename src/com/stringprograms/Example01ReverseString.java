package com.stringprograms;

import java.util.Scanner;

public class Example01ReverseString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.next();

		/*
		 * int len = str.length(); String rev = ""; // 1.Logic --Using +(Concat) for
		 * (int i = len - 1; i >= 0; i--) { rev = rev + str.charAt(i); }
		 */

		// 2.Logic --Using CharacterArray
		/*
		 * char a[] = str.toCharArray(); int len = a.length; String rev = ""; for (int i
		 * = len - 1; i >= 0; i--) { rev = rev + a[i];
		 * 
		 * }
		 */

		// 3.Logic --Using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse String  :" + rev);

	}
}