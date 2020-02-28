package com.programs.string;

import java.util.Arrays;

public class Example09StringINAscendingOrder {

	public static String sortString(String inputString) {

		char c[] = inputString.toCharArray();
		Arrays.sort(c);
		return new String(c);

	}

	public static void main(String[] args) {

		String inputString = "JAVAJ2EE";
		String outputString = sortString(inputString);

		System.out.println("INPUT STRING IS  :" + inputString);
		System.out.println("OUTPUT STRING IS :" + outputString);

	}

}
