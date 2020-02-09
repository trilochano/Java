package com.string;

import java.util.HashMap;
import java.util.Map;

public class Example06ToCountOccuranceOfEachCharacterInString {

	public static void characterCount(String inputString) {

		inputString = inputString.toUpperCase();
		inputString = inputString.replaceAll("\\s", "");

		// 1.create HashMap
		Map<Character, Integer> charCountHashmap = new HashMap<Character, Integer>();

		// 2.Converting given String to char array
		char[] strArray = inputString.toCharArray();

		// 3.Check each char of string Array
		for (char c : strArray) {
			if (charCountHashmap.containsKey(c)) {

				// 4.if char is present in charCountHashmap,
				// incrementing its count by 1
				charCountHashmap.put(c, charCountHashmap.get(c) + 1);

			} else {

				// 5.if char is not present in charCountHashmap,
				// putting this char to charCountMap with 1 as it's value
				charCountHashmap.put(c, 1);
			}
		}

		// 6.Printing inputString and charCountMap
		System.out.println(inputString + " : " + charCountHashmap);

	}

	public static void main(String[] args) {

		characterCount("JavA J2EE Java JSP J2EE");

		characterCount("All Is Well");

		characterCount("Done And Gone");

	}

}
