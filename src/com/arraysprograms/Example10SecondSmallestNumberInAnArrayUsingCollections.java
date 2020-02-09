package com.arraysprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example10SecondSmallestNumberInAnArrayUsingCollections {

	public static int getSecondSmallest(Integer a[], int total) {

		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		return list.get(1);

	}

	public static void main(String[] args) {
		Integer[] a = { 23, 90, 78, 6778, 900 };
		Integer secondSmallest = getSecondSmallest(a, a.length);
		System.out.println("Second Smallest Number   :" + secondSmallest);

	}
}
