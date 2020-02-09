package com.arrays;

import java.util.Arrays;

public class Example10SecondSmallestNumberInAnArrayUsingArraysMethod {

	public static int getSecondSmallest(int[] a, int total) {
		Arrays.sort(a);
		return a[1];

	}

	public static void main(String[] args) {
		int a[] = { 23, 90, 78, 6778, 900 };
		int secondSmallest = getSecondSmallest(a, a.length);
		System.out.println("Second Smallest Number   :" + secondSmallest);

	}
}
