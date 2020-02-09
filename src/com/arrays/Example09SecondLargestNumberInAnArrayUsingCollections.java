package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example09SecondLargestNumberInAnArrayUsingCollections {

	public static int getSecondLargest(Integer a[], Integer total) {

		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		return list.get(total - 2);

	}

	public static void main(String[] args) {
		Integer a[] = { 23, 90, 89, 890 };
		int secondLargest = getSecondLargest(a, a.length);
		System.err.println("Second Largest   " + secondLargest);

	}

}
