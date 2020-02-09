package com.arraysprograms;

import java.util.Arrays;

public class Example08SecondLargestNumberInAnArrayUsingArraysMethod {

	public static int getSecondLargest(int a[], int total) {

		Arrays.sort(a);
		return a[total-2];

	}

	public static void main(String[] args) {
		int a[] = { 23, 89, 3, 90, 900 };
		int secondLargest = getSecondLargest(a, a.length);
		System.out.println("Second Largest Number   :" + secondLargest);
	}

}
